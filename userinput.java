import java.util.Scanner;

public class userinput{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your name:");
        String name= scanner.nextLine();
        System.out.println("Hello, "+name+"!");

        System.out.println("Your age:");
        int age= scanner.nextInt();
        System.out.println("You are "+ age +" years old.");

        System.out.println("Enter a decimal number:");
        double num= scanner.nextDouble();
        System.out.println("You entered: "+ num);

        scanner.close();
    }
}