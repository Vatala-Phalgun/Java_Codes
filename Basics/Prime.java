class Prime
{
public static void main(String args[])
{
   int i,j,count;
  System.out.println("Prime numbers from 1 to 100\n");
  for(i=2;i<100;i++)
   {
       count=0;
      for(j=1;j<=i;j++)
     {
        if(i%j==0)
        { 
           count++;
        }
}
 if(count==2)
    {
       System.out.println(i);
   }
}
}
}
       
        

