//Method overloading
class sum{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class methodOverloading{
    public static void main(String[] args){
        sum obj= new sum();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(4.2,6.3));
        System.out.println(obj.add(3,4,6));
    }
}
