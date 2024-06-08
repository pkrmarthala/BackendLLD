package Constructors;

public class Student {
    private String name;
    public int age;
    String batch;
    protected double psp;
    double attPer; // attendance percentage

    /* Constructor:
     * Constructor helps you to initialize an object. Java provides a default constructor if you have not defined any.
     * And it will never interfere if you defined any constructor in your code.
     */


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printStudent() {
        System.out.println("Name: " + name);
    }

    void attendClass() {
        System.out.println("Attend Class: " + attPer);
    }
}
