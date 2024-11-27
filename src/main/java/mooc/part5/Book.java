package mooc.part5;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pageCount = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String toString() {
        return getAuthor()+", "+getName()+", "+getPageCount();
    }

    public static void main(String[] args) {
        Book b = new Book("J. K. Rowling", "Harry Potter", 341);
        System.out.println(b);
    }
}
