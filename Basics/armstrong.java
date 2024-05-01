public class armstrong
{
    static int digitcount(int x)
    {
        int count=0;
        while(x>0)
        {
            x=x/10;
            count++;
        }
        return count;
    }
    static void Armstrong(int n)
    {
        int temp=0;
        int a=digitcount(n);
        int num=n;
        while(n>0)
        {
            temp+=Math.pow((n%10),a);
            n=n/10;
        }
        if(temp==num)
        {
            System.out.println("Yes,This is an Armstrong Number");
        }
        else
        {
            System.out.println("No,This is not An Asrmstrong Number");
        }
    }
    public static void main(String args[])
    {
        int a=153;
        Armstrong(a);
    }
}