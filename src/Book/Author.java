package Book;

public class Author {

    public Author(String firstName, String lastName) {
        this.firstName = "Oscar";
        this.lastName = "Wylde";

    }

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
}





