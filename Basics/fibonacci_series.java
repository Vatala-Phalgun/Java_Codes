import java.util.*;
public class fibonacci_series 
{
    public static void main(String args[])
    {
        int a=0,b=1,i=0;
        System.out.println("Enter the number of terms in series: ");
        Scanner obj=new Scanner(System.in);
        int x = obj.nextInt();
        System.out.println(a);
        System.out.println(b);
        
        do
        {
            int sum=a+b;
            i++;
            System.out.println(sum);
            a=b;
            b=sum;
        }while(i<=x);
        obj.close();
    }
    
}
