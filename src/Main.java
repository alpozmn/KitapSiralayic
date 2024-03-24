import java.util.*;

class Main implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    // Constructor
    public Main(String bookName, int pageCount, String authorName, String publicationDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    // Getter methods
    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // compareTo method override
    @Override
    public int compareTo(Book other) {
        return this.bookName.compareTo(other.getBookName());
    }

    // toString method override
    @Override
    public String toString() {
        return "Book Name: " + bookName + ", Page Count: " + pageCount + ", Author Name: " + authorName + ", Publication Date: " + publicationDate;
    }
}

public class Main {
    public static void main(String[] args) {
        // Book nesnelerini oluşturma
        Book book1 = new Book("Book1", 200, "Author1", "01/01/2022");
        Book book2 = new Book("Book2", 300, "Author2", "01/01/2021");
        Book book3 = new Book("Book3", 150, "Author3", "01/01/2023");
        Book book4 = new Book("Book4", 250, "Author4", "01/01/2020");
        Book book5 = new Book("Book5", 180, "Author5", "01/01/2024");

        // Kitapları isme göre sıralayan TreeSet oluşturma
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralayan TreeSet oluşturma
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageCount() - b2.getPageCount();
            }
        });
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
