package Book;

public class Author {
    private String name;

    public static Book createAuthor(String name, int age) {
        Book Author = new Book();
        Author.name = "Allan Milne";
        return Author;
    }
    public String getName(){
        return this.name;
    }

}

