import java.util.Scanner;
import java.util.ArrayList;

class Book{
    String title;
    String author;
    String isbn;
}

class Library{
    ArrayList<Book> books= new ArrayList<>();

    void addBook(Book book){
        books.add(book);
        System.out.println(book.title +" added to the library.");
    }

    Book searchByTitle(String title){
        for(Book b: books){
            if(b.title.equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Books in library:");
        for(Book b: books){
            System.out.println("Title: "+ b.title);
            System.out.println("Author: "+ b.author);
            System.out.println("ISBN: "+ b.isbn);
        }
    }
}

public class LibraryManagement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Library library= new Library();

        while(true){
            System.out.println("\n1. Add book");
            System.out.println("2. Search book by title");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.println("Enter choice:");

            int choice= sc.nextInt();
            sc.nextLine();

            if(choice==1){
                Book book= new Book();

                System.out.println("Enter title: ");
                book.title=sc.nextLine();

                System.out.println("Enter author: ");
                book.author=sc.nextLine();

                System.out.println("Enter ISBN: ");
                book.isbn=sc.nextLine();

                library.addBook(book);
            }

            else if(choice==2){
                System.out.println("Enter title to search:");
                String title= sc.nextLine();

                Book found=library.searchByTitle(title);
                if (found!= null){
                    System.out.println("Book found: ");
                    System.out.println("Title: "+found.title);
                    System.out.println("Author: "+found.author);
                    System.out.println("ISBN: "+found.isbn);
                } else{
                    System.out.println("book not found.");
                }
            }
            else if(choice==3){
                library.displayAllBooks();
            }
            else if(choice==4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}