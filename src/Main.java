import Book.Book;

public class Main {
    public static Book createBook(String title, int age) {
        Book Book = new Book();
        Book.title = title;
        Book.yearOfPublication = age;
        return Book;
    }

    public static Book createAuthor(String name) {
        Book Author = new Book();
        Author.name = name;
        return Author;
    }


    public static Book createBook2(String title, int age) {
        Book Book2 = new Book();
        Book2.title = title;
        Book2.age = age;
        return Book2;
    }

    public static Book createAuthor2(String name) {
        Book Author2 = new Book();
        Author2.name = name;
        return Author2;
    }


    public static void main(String[] args) {
        Book winnie = createBook("Winnie the Pooh", 1926);
        System.out.println("winnie.title = " + winnie.getTitle());
        System.out.println("winnie.age = " + winnie.getYearOfPublication());
        winnie.setYearOfPublication(1950);
        System.out.println("winnie.getYearOfPublication() = " + winnie.getYearOfPublication());


        Book Author = createAuthor("Allan Milne");
        System.out.println("Author.name = " + Author.getName());

            Book dorian = createBook2("Dorian Grey", 1890);
            System.out.println("dorian.title = " + dorian.title);
            System.out.println("dorian.age = " + dorian.age);
            dorian.age(1900);
            System.out.println("dorian.getAge() = " + dorian.age);



            Book Author2 = createAuthor("Oskar Wylde");
            System.out.println("Author2.name = " + Author2.getName());
        }
    }



