public class prime_hun_to_thou 
{
    public static void main(String args[]) 
    {
        int i = 100;
        int count;
        System.out.println("Prime numbers from 100 to 1000 are as follows : ");
        while (i <= 1000) 
        {
            int j;
            count = 0;
            for (j = 1; j <= i; j++)
             {

                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2) 
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
