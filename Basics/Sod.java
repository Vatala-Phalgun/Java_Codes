import java.util.*;
class Sod
{
  public static void main(String args[])
  {
    int sum=0;
    System.out.println("Enter the number below: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num!=0)
    {
      sum=sum+num%10;
      num=num/10;
    }
    System.out.println("Sum of Digits of the Entered Number is "+sum);
    sc.close();
  }
}