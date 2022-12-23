import Homework.Author;
import Homework.Book;

public class Main {
    public static void main(String[] args){
        Author stephenKing = new Author("Стивен","Кинг");
        Author arthurDoyle = new Author("Артур", "Дойл");
        Book greenMile = new Book("Зелённая миля", 2014, stephenKing);
        Book sherlockHolmes = new Book("Шерлок Холмс", 1993, arthurDoyle);
        System.out.println(greenMile);
        System.out.println(sherlockHolmes);
        greenMile.setYear(2000);
        System.out.println(greenMile);
    }
}