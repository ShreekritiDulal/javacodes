// First interface
interface A {
    void show();
}

// Second interface
interface B {
    void show();
}

// Class implementing both interfaces
class DiamondProblemSolution implements A, B {

    public void show() {
        System.out.println("Diamond problem solved using interface");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        DiamondProblemSolution obj = new DiamondProblemSolution();
        obj.show();
    }
}