package nl.inholland;

public class Program {

    public static void main(String[] args) {
	    Program p = new Program();
        p.start();
    }

    void start() {
        Student student = new Student("Henkie", "Henkie@gmail.com", "ITFT2A");
        Teacher teacher = new Teacher("Petertje", "Petertje@inholland.nl", 2000.00);

        System.out.println(student);
        System.out.println(teacher);
    }
}
