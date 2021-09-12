package nl.inholland;

public class Teacher extends Person {
    double salary;

    public Teacher(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Role: Teacher%nSalary: € %.2f%n", salary);
    }
}
