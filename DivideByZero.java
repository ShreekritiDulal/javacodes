//WAP to divide two numbers where you should be checking the condition of divide by zero.
import java.util.Scanner;
public class DivideByZero{

    public static double condition(double divident, double divisor){
        if(divisor==0){
            System.out.println("Division by zero is not allowed.");
            return 0;
        }else{
            double result=divident/divisor;
            return result;
        }
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter divisor: ");
        double a= scanner.nextDouble();

        System.out.println("Enter divident:");
        double b= scanner.nextDouble();

        System.out.println(b+" divided by "+a+" is: "+condition(b,a));

        scanner.close();
    }
}