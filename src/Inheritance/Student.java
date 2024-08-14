package Inheritance;

public class Student extends User{
    private String batch;
    double psp;

    Student() {
        System.out.println("Student Constructor");
    }

    void attendClass() {
        // Child class cannot access the private entities of Parent class.
        // this.id
        // We should have a getter & setter functions in the Parent class to access those.
        this.setId(10);

        // default attribute can be accessed.
        this.name = "Praveen";
        System.out.println("Attend Class");
    }
}
