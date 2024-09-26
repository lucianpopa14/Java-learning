package src.main.mooc.part7;

import java.util.ArrayList;

public class BinaryAndLinearSearch {
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int start = 0;
        int end = books.size() - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int middleId = books.get(middle).getId();
            if (searchedId == middleId) {
                return middleId;
            } else if (searchedId > middleId) {
                start = middle + 1;
            } else if (searchedId < middleId) {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(21, "andkajsk"));
        books.add(new Book(111,"akmklamsclas"));
        books.add(new Book(131,"akmklamsclas"));
        books.add(new Book(19,"akmklamsclas"));
        books.add(new Book(43,"akmklamsclas"));
        books.add(new Book(9,"akmklamsclas"));

        System.out.println(binarySearch(books, 99));
        System.out.println(binarySearch(books, 131));
    }
}
