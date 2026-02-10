final class FinalDemo {

    // final variable (constant)
    final int MAX_VALUE = 100;

    // final method (cannot be overridden)
    final void display() {
        System.out.println("Final variable value: " + MAX_VALUE);
    }
}

public class finalmain{
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}