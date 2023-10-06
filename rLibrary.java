import java.util.Scanner;
import java.util.ArrayList;

class library {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<>();
    ArrayList<String> issuedBooks = new ArrayList<>();
    int arrayLength = books.size();

    library() {
        books.add("My Vampire System");
        books.add("The Legendary Survivor");
        books.add("School of Magic");
    }

    void addBooks() {
        System.out.print("Which book you want to add: ");
        String addBookName = sc.nextLine();
        books.add(addBookName);
        System.out.println("Book is successfully added!");
    }
    void issueBooks() {
        System.out.println("Books availabe in library: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ") " + books.get(i));
        }
        System.out.print("Which book you want to issue: ");
        int bookIndex = sc.nextInt();

        if (bookIndex >= 1 && bookIndex <= books.size()) {
        String issuedBookName = books.remove(bookIndex - 1);
        issuedBooks.add(issuedBookName);
        System.out.println("Book '" + issuedBookName + "' is successfully issued!");
        } else {
            System.out.println("Invalid book index. Book cannot be issued.");
        }
    }
    void returnBook() {
        System.out.println("Books you issued: ");
        for (int i = 0; i < issuedBooks.size(); i++) {
            System.out.println((i + 1) + ") " + issuedBooks.get(i));
        }
        System.out.print("Which book you want to return: ");
        int bookReturn = sc.nextInt();

        if (bookReturn >= 1 && bookReturn <= books.size()) {
        String returnBookName = issuedBooks.remove(bookReturn - 1);
        books.add(returnBookName);
        System.out.println("Book '" + returnBookName + "' is successfully returned!");
        } else {
            System.out.println("Invalid book index. Book cannot be returned.");
        }
    }
    void showAvailableBooks() { 
        System.out.println("There are total of " + books.size() + " Books they are:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ") " + books.get(i));
        }
    }
    void showIssuedBooks() { 
        System.out.println("There are total of " + issuedBooks.size() + " Issued Books they are:");
        for (int i = 0; i < issuedBooks.size(); i++) {
            System.out.println((i + 1) + ") " + issuedBooks.get(i));
        }
    }
}

public class rLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library lib = new library();

        int select = 0;
        

        System.out.println("Enter Your name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to our Library!");
        while (true) {
            System.out.println("Please select one option:\n1) Add Books\n2) Issue a Book\n3) Return a Book\n4) Show availabe Books\n5) Show Issued Books");
            select = sc.nextInt();
            sc.nextLine();

            if (select == 1) {
                lib.addBooks();
            } else if (select == 2) {
                lib.issueBooks();
            } else if (select == 3) {
                lib.returnBook();
            } else if (select == 4) {
                lib.showAvailableBooks();
            } else if (select == 5) {
                lib.showIssuedBooks();
            }
        }
    }
}