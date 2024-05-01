class demo {
    demo getdemo() {
        return this;
    }

    void method() {
        System.out.println("Returns method");
    }
}

public class this6 {
    public static void main(String args[]) {
        new demo().getdemo().method();
    }

}
