public class tryCatch {
    void main() {
        try{
            study();
        }
        catch(RuntimeException e){
            System.out.println("Out for syllabus");
        }
        finally{
            System.out.println("Exam toh dena hi padega");
        }
}
static void study(){
    throw new RuntimeException("Yeh toh na horra hai");
}
}
