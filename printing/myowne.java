public class myowne {
    void main(){
        int age = 16;
        try
        {
            if ( age < 18 )
            {
                throw invalidAgeException{
                    "this age is invalid";
                }
            }

        }
        catch(invalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("we are done here");
        }
    }
}
