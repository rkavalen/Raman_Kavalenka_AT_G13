package homework.day7.prep;

import java.util.Objects;

public class Book {
    private String name;
    private String Author;

    public Book(String name, String author) {
        this.name = name;
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
