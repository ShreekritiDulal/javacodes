class parent{
    parent(){
        System.out.println("parent class constructor");
    }
}

class child extends parent{
    child(){
        super();
        System.out.println("child class constructor");
    }
}

public class Static{
    public static void main(String[] args){
        new child();
    }
}