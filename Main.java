//WAP to demonstrate the use of instance variable and static variable along with instance and static method.
class add{
    //instance method
    public int sum(int x, int y){
        return x+y;
    }
}

public class Main{
    //static variable
    public static int a=20;

    //instance variable
    public int b=10;

    //static method
    public static int multiply(int x, int y){
        return x*y;
    }
    public static void main(String[] args){

        Main obj= new Main();
        add AddObj=new add();

        System.out.println("Addition(instance method and static variable): "+AddObj.sum(a,5));
        System.out.println("Myltiply(static method with instance and static variable): "+multiply(a,obj.b));

        System.out.println("Static variable: "+a);
        System.out.println("Instance variable: "+obj.b);
    }
}