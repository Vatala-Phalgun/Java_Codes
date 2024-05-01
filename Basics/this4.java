import java.util.*;

class this4 {
    void sample(this4 obj) {
        System.out.println("Method is Invoked");
    }

    void display() {
        sample(this);
    }

    public static void main(String args[]) {
        this4 obj = new this4();
        obj.display();
    }
}