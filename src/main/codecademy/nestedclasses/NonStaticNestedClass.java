package src.main.codecademy.nestedclasses;


public class NonStaticNestedClass {
    public static void main(String[] args) {
        Lib fiction = new Lib("book", "fiction");
        Lib.Book book = fiction.new Book();
        book.setDescription();
        System.out.println("Fiction book description: " + book.getDescription());
        Lib nonFiction = new Lib("book", "nonfiction");
        Lib.Book book2 = nonFiction.new Book();
        book2.setDescription();
        System.out.println("Non-fiction book description = " + book2.getDescription());
    }
}

