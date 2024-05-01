import java.util.*;
public class palindrome 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Hello.Enter the Number below: ");
        int num=obj.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        if(temp==rev)
        {
            System.out.println(temp+" is a palindrome.");
        }
        else
        {
            System.out.println(temp+" is not a palindrome");
        }
        obj.close();


    }
    
}
