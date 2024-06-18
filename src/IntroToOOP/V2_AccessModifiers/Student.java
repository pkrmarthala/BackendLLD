package IntroToOOP.V2_AccessModifiers;

public class Student {
    // Data Members
    // If we do not explicitly write any access modifier, it will be 'default'

    // We cannot access the private members anywhere outside the class. Not even on the same package
    private String name;
    public int age;
    String batch;
    protected double psp;
    double attPer; // attendance percentage
    // Member functions

    /*
     * To access and modify private values, we have the getter and setter functions.
     * The functions can access these private values since they are in the same Class, Student.
     * We just need to call these functions with appropriate parameters from the Client class.
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
