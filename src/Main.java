import Book.Author;
import Book.Book;

public class Main {

    public static void main(String[] args) {


        Author author = new Author("Oskar", "Wylde");
        Book book = new Book("Dorian Grey", 1890, author);

        System.out.println(book.getYearOfPublication());
        book.setYearOfPublication(1876);
        System.out.println(book.getYearOfPublication());

        System.out.println(book.getAuthor().getFirstName());
        System.out.println(book.getAuthor().getLastName());
        System.out.println(book.getTitle());




}
}




