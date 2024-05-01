public class nested_try 
{
    public static void main(String[] args) 
    {
        try 
        {
            try 
            {
                System.out.println("Going to Divide by 0");
                int b = 30 / 0;
                System.out.println(b);
            } 
            catch (ArithmeticException e) 
            {
                System.out.println(e);
            }
            try 
            {
                int a[] = new int[5];
                System.out.println(a[0]);
            } 
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("Other Statement");
        } 
        catch (Exception e) 
        {
            System.out.println("Handled by Outermost Catch Block");
        }
        System.out.println("Normal Flow");
    }
}
