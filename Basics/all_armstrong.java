public class all_armstrong {
    static int digitcount(int x) {
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    static void Armstrong(int n) {
        int temp = 0;
        int a = digitcount(n);
        int num = n;
        while (n > 0) {
            temp += Math.pow((n % 10), a);
            n = n / 10;
        }
        if (temp == num) {
            System.out.println(temp);
        }
    }

    public static void main(String args[]) {
        int i;
        for (i = 0; i < 10000; i++) {
            Armstrong(i);
        }
    }
}
