import java.util.*;

public class this2 {
    this2(String name) {
        System.out.println("Greetings " + name);
    }

    void display() {
        System.out.println("You are learning Java.");
    }

    void display1() {
        this.display();
    }

    public static void main(String args[]) {
        String name;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = obj.nextLine();
        this2 exp = new this2(name);
        exp.display1();
        obj.close();

    }

}
