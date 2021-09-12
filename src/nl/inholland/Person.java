package nl.inholland;

public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nEmail: %s%n", name, email);
    }
}
