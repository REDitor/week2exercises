package nl.inholland;

public class Program {

    public static void main(String[] args) {
	    Program p = new Program();
        p.start();
    }

    void start() {
        Person[] people = new Person[] {
            new Student("Henkie", "Henkie@gmail.com", "IT2A"),
            new Student("Pietertje", "Pietertje@outlook.com", "IT2B"),
            new Teacher("Henk", "Henk@inholland.nl", 2000),
            new Teacher("Pieter", "Pieter@inholland.nl", 3000)
        };

        for (Person person : people) {
            System.out.println(person);

            if (person.getClass() == Teacher.class) {
                System.out.printf("Yearly Salary: € %.2f%n%n%n",  calculateSalary(((Teacher) person).salary));
            }
        }
    }

    private double calculateSalary(double salary) {
        return salary * 12;
    }
}
