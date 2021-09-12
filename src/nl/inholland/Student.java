package nl.inholland;

public class Student extends Person {
    String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Role: Student%nGroup: %s%n", group);
    }
}
