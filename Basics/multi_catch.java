import java.util.*;
public class multi_catch
{
    public static void main(String[] args) 
    {
        int a[]={5,10};
        int b=5;
        try {
            {
                int x=a[1]/(b-a[0]);
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Divide by Zero");
            System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Error");
        }
        catch (ArrayStoreException e) 
        {
            System.out.println("Wrong Data Type");
        }
        int y=a[1]/a[0];
        System.out.println("y="+y);;
    }
}