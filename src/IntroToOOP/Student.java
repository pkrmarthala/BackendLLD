package IntroToOOP;

public class Student {
    // Data Members
    // If we do not explicitly write any access modifier, it will be 'default'

    // We cannot access the private members anywhere outside the class. Not even on the same package
    private String name;
    public int age;
    String batch;
    protected double psp;
    double attPer; // attendance percentage

    /* Constructor:
     * Constructor helps you to initialize the object.
     *
     * Java provides a default constructor if you have not defined any.
     * This default constructor will initialize the values of attributes depending on their datatypes.
     *
     * Java will never interfere if you defined any constructor in your code.
     * Reason: If the programmer definitely want some parameters to be passed for object creation and
     * the constructor is already written in that way, but still the default constructor is available,
     * it will allow object creation without any parameters.
     */

    /*
     * Constructor with no parameters. Access Modifier: default.
     * This constructor cannot be accessed for object creation in any class outside this IntroToOOP package unless it is made public
     */

//    Student() {
//        this.name = "A student";
//        this.age = 25;
//        this.batch = "new batch";
//        this.psp = 70.0;
//        this.attPer = 90.0;
//    }

    public Student() {
        this.name = "A student";
        this.age = 25;
        this.batch = "new batch";
        this.psp = 70.0;
        this.attPer = 90.0;
    }

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
