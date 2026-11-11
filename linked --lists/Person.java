class Person{
    private String lastName;
    private String firstName;
    private int age;
public Person(String last, String first, int age)
{
    firstName = first;
    lastName = last;
    this.age = age;
}

public void displayPerson()
{
    System.out.print(" Last Name of the person: " + lastName);
    System.out.print(", First Name of the person: " + firstName);
    System.out.println(", Age of the Given Person: " + age);
}
public String getLast()
{
    return lastName;
}
class ArrayIn0b
{
    private Person[] a;
    private int nElems;
    public ArrayIn0b(int max)
    {
    a = new Person[max];
    nElems = 0;
    }

    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }
    public void display(){
        for(int j = 0; j < nElems; j++){
            a[j].displayPerson();
        }
    }
    public void insertionSort()
    {
        int in, out;
        for(out = 1; out < nElems; out++)
        {
            Person temp = a[out];
            in = out;
        }

    }
    while(in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0)
    {
       a[in] = a[in - 1];
    }

}

}