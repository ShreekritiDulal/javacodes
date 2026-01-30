//WAP to add two numbers entered by the user.
import java.util.Scanner;
public class add{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter two numbers pressing enter respectively: ");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= a+b;
        System.out.println("Addition of "+a+" and"+b+" is "+c);
        scanner.close();

    }
}