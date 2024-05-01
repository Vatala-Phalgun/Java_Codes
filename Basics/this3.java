class demo {
    demo() {

    }

    demo(int x) {
        this();
        System.out.println("Value passed is " + x);
    }
}

public class this3 {
    public static void main(String[] args) {
        demo obj = new demo(7);
    }

}
