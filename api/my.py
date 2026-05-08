from fastapi import FastAPI, Path
app = FastAPI()
from typing import Optional
from pydantic import BaseModel

students = {
    1:{
        "name" : "yash", 
        "age" : "24",
        "class": "year 12"
    },
    2:{
        "name" : "boss",
        "age" : "20"
        
    }
}
"""
Requesting the Body and the Post Method
1st step is to make a class 
then add a Post method to the app.get endpoint correct me if i am wrong
"""
class Student(BaseModel):
    name : str
    age : int
    year : int

#now we will make a class to use PUT so for that we will make the update student class 
class Update_student(BaseModel):
    name: Optional[str] = None
    age: Optional[int] = None
    year: Optional[str] = None

#localhost/delete-user  is del.. is the endpoint here
#amazon.com/delete-user
"""
GET
PUT
POST
DELETE
UPDATE

"""
@app.get("/")
def index():
    return {"name": "First data"}


@app.get("/get-student/{student_id}")
def get_student(student_id: int = Path(..., description = "THe ID of the studnet you wnat to view", gt = 0)):
    return students[student_id]

    #gt = greater than , lt = lesser than, le = ?
#Query parameter
#google.com/results?search=Python


# @app.get("/get-by-name")#@app.get("/get-by-name?name=john") previous code 
# Now going to change the below code into the query and path parameter at the same time
@app.get("/get-by-name/{student_id}")
def get_student_by_name(*,name:Optional[str] = None, test: int):
    for student_id in students:
        if students[student_id]["name"] ==name:
            return students[student_id]
    return{
    "data": "not found"
}
#Combining path parameter and query parameter

    @app.post("/create-student/{student_id}")
    def create_student(student_id: int, student : Student):
        if student_id in students:
            return {"Error" : "student Exists"}
        studets[student_id] = student
    
@app.put("/upate-student/{studnet_id}")
def update_student(student_id: int, student: UpdateStudent):
    if student_id not in students:
        return {"Error" : "Student does not exist"}
    if student.name != None:
        students[student_id].name = student.name
    if student.age != None:
        students[student_id].age = student.age
    if student.year != None:
        students[student_id].year
    return student[student_id]

@app.delete("/delete-student/{student_id: int} ")
if stud not in students:
    return {"Error"}

del students[student_id]
return{"message": "Student deleted sucessfully"}