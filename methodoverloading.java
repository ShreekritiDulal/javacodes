import java.util.Scanner;
public class methodoverloading{
    
    static int sum(int a){
        int add= a+6;
        return add;
    }

    static int sum(int a, int b){
        int add= a+b;
        return add;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the value of a and b respectively");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        System.out.println("1st method: "+ sum(a));
        System.out.println("2nd method: "+ sum(a,b));

        scanner.close();

    }
}