public class this1 {
    int x;
    int y;
    int z;

    this1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);
        System.out.println("Value of Z is: " + z);
    }

    public static void main(String args[]) {
        this1 obj = new this1(15, 8, 7);
        obj.display();

    }

}
