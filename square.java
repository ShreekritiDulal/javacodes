//WAP to take an integer as input and print it's square.
import java.util.Scanner;

public class square{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Write a number to find it's square:");
        int num= scanner.nextInt();
        int sq= num*num;
        System.out.println("Square of "+ num + " is "+ sq);

        scanner.close();
    }
}
