package Homework;

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
}
