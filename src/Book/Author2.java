package Book;

public class Author2 {

    private String name;

    public static Book createAuthor(String name, int age) {
        Book Author = new Book();
        Author.name = "Oskar Wylde";
        return Author;
    }
    public String getName(){
        return this.name;
    }
}

