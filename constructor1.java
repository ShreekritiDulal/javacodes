class Demo{
    Demo(){
        this("Default constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
}

public class constructor1{
    public static void main(String[] args){
        new Demo();
    }
}

//using this or super keyword in a single java program and execute it.
//use super keyword to fetch method from the parent class and execute the program.