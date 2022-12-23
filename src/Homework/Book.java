package Homework;

import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return " Название книги " + name + " год выпуска " + publicationYear + " автор " + author;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }
}

