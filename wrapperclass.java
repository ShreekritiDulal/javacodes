import java.util.Scanner;
public class wrapperclass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float floatInput = scanner.nextFloat();
        Float floatObject = Float.valueOf(floatInput);
        
        int intValue = floatObject.intValue();

        System.out.println(floatObject);
        System.out.println(intValue);

        scanner.close();
    }
}
