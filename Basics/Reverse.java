class Reverse
{
  public static void main(String args[])
  {
    int num=223;
    int remainder,reverse=0;
   while(num!=0) 
    {
       remainder=num%10;
       reverse=reverse*10+remainder;
       num=num/10;
   }
System.out.println("The Reverse of Given Number is "+reverse);
}
}