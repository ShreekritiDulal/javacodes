//same variable name this keyword example
class Student{
    String name;

    Student(String name){
        this.name=name;
    }

    void display(){
        System.out.println("Name: "+this.name);
    }
}

public class Main3{
    public static void main(String[] args){
        Student s=new Student("Alice");
        s.display();
    }
}