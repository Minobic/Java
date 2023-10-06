import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook{" + "name = '" + name + '\'' + ", author = '" + author + '\'' + "}";
    }
}

class library {
    public ArrayList<Book> books;

    public library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("Book '" + book + "' has been added sucessfully!");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("Book '" + book + "' has been issued sucessfully issued to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("Book '" + b + "' has been returnd sucessfully!");
        this.books.add(b);
    }
}

public class advanceLibrary {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("School of Magic","Minobic");
        bk.add(b1);
        Book b2 = new Book("The Legendry Survivor","MinoBot");
        bk.add(b2);
        Book b3 = new Book("My Vampire System","Mino");
        bk.add(b3);

        library l = new library(bk);
        l.addBook(new Book("New", "unknown"));

        System.out.println(l.books);

        l.issueBook(b3, "Mayank");
    }
}