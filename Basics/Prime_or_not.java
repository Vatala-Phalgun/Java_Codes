import java.util.*;
public class Prime_or_not 
{
    static int check(int p)
    {
        int i,count=0;
        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println("Hello User.Enter the number below: ");
         Scanner sc = new Scanner(System.in);
        
            int num=sc.nextInt();
            int c=check(num);
            if(c==2)
            {
                System.out.println("It is Prime.");
            }
            else
            {
                System.out.println("It is Not Prime.");
            }
         sc.close();
        }
}
    

