package exercitiul6;

// 6. Create a class Book with the following attributes:

// String title
// String author
// double price
// Then, create an ArrayList<Book> and add several Book objects to the list. Write a method to print out the details of each book in the list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Adam si Eva", "Liviu Rebreanu", 30.99));
        bookList.add(new Book("Amandoi", "Liviu Rebreanu", 45.99));
        bookList.add(new Book("Aripi de zapada", "Constantin Chirita", 37.54));

        printBook(bookList);
        sortMaxPrice(bookList);

        for (Book book : bookList) {
            System.out.println(book);
        }

    }

    public static void printBook(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    private static void sortMaxPrice(List<Book> books) {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.price, o1.price);
            }
        });


    }
}





