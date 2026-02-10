//Simple library system in java.
import java.util.Arrays;
import java.util.Scanner;
class Book{
    String title;
    String author;
    String isbn;
}

class Library extends Book{
    void addBook(Book book){
        
    }

    int searchByTitle(String title){
        Scanner scanner= new Scanner(System.in);
        title= scanner.nextLine();
        System.out.println(title+" found in library");
        return 1;
    }



}

public class Caseone{
    public static void main(String[] args){

    }
}