import java.util.*;
public class max_in_three 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>b && a>c)
            {
                System.out.println("The Max of the three numbers is "+a);
            }
            else if(b>a && b>c)
            {
                System.out.println("The Max of the three numbers is "+b);
            }
            else
            {
                System.out.println("The Max of the three numbers is "+c);
            }
        }
        }
    
}
