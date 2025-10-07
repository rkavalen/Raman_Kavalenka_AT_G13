package homework.day7;

import homework.day7.prep.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookTask {
    public static void main(String[] args) {
        ArrayList<Book> booksArray = new ArrayList<>();
        Book b1 = new Book("Война и мир", "Толстой");
        Book b2 = new Book("Преступление и наказание", "Достоевский");
        Book b3 = new Book("Мастер и Маргарита", "Булгаков");
        booksArray.add(b1);
        booksArray.add(b2);
        booksArray.add(b3);

        for (Book book : booksArray) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();

        HashMap<String, String> booksMap = new HashMap<>();
        for (Book book : booksArray) {
            booksMap.put(book.getName(), book.getAuthor());
        }

        for (String n : booksMap.keySet()) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (String a : booksMap.values()) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (Map.Entry<String, String> bookEntry : booksMap.entrySet()) {
            System.out.printf("%s-%s\n", bookEntry.getKey(), bookEntry.getValue());
        }
    }
}
