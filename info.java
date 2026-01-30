//WAP to print your name, roll no and address in 3 different lines.
import java.util.Scanner;
public class info{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Name:");
        String name= scanner.nextLine();

        System.out.print("RollNo:");
        int roll= scanner.nextInt();

        scanner.nextLine();
        System.out.print("Address:");
        String address= scanner.nextLine();

        System.out.println(" ");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("Address: "+address);

        scanner.close();
    }
}