import java.util.*;

class Perfect {
   public static void main(String args[]) {
      int i, sum = 0;
      System.out.println("Enter the Input Value Below: ");
      try (Scanner obj = new Scanner(System.in))
       {
         int num = obj.nextInt();
         for (i = 1; i < num; i++) {
            if (num % i == 0) {
               sum = sum + i;
            }
         }
         if (sum == num) {
            System.out.println("Yes.The Entered Number is Perfect.");
         } else {
            System.out.println("No.It is Not Perfect.");
         }
  obj.close();
      }
   }

}