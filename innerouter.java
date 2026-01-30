//WAP to demonstrate the concept of an outer class and an inner class.
class Outerclass{
    int x=10;
    class Innerclass{
        int y=5;
        void display(){
            System.out.println("Outer x is: "+x);
        }
    }
}

public class innerouter{
    public static void main(String[] args){
        Outerclass Outer= new Outerclass();
        Outerclass.Innerclass Inner= Outer.new Innerclass();
        Inner.display();
    }
}