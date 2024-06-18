package IntroToOOP.V4_CopyConstructors;

public class Student {

    private String name;
    public int age;
    String batch;
    protected double psp;
    double attPer; // attendance percentage
    // unitTest is a reference variable of Exam Class.
    Exam unitTest;

    // Non-parametrized Constructor
    public Student() {
        this.name = "A student";
        this.age = 25;
        this.batch = "new batch";
        this.psp = 70.0;
        this.attPer = 90.0;
        // unitTest is a reference variable of Exam Class.
        this.unitTest = new Exam(1, 90);
        // this.repeatUnitTest = new ReattemptExam(1, "UnitTest1", 80);
    }

    // Parametrized IntroToOOP.Constructors below
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public Student(String name, int age, String batch, double psp) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
    }

    public Student(String name, int age, String batch, double psp, double attPer) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.attPer = attPer;
    }

    /* We cannot copy an object by the simple code below.
     * Student s2 = s1;
     * This will create a new object s2 that still points to s1.
     *
     * -----------------------------------------------------------------------------------------------------------------
     * To copy an object to a new object, we need to create the object first and copy all the parameters inside on that.
     *
     * Student s2 = new Student();
     * s2.name = s1.name;
     * s2.age = s1.age;
     * s2.batch = s1.batch;
     * s2.psp = s1.psp;
     * s2.attPer = s1.attPer;
     *
     * Doing so at multiple instances will result in redundant code and effort loss.
     *
     * -----------------------------------------------------------------------------------------------------------------
     * That's where need a Copy Constructor.
     *
     * Copy Constructor
     *
     * This is used to create an object similar to other objects.
     * Takes the object as the input parameter and sets the values of that passed parameter to the newly created object.
     */

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.psp = s.psp;
        this.attPer = s.attPer;

        /* Shallow Copy
         * We are just copying the references. Not the actual data to a new object.
         */
//        this.unitTest = s.unitTest;

        // Deep Copy
        this.unitTest = new Exam(s.unitTest);
        //this.repeatUnitTest = new ReattemptExam(s.repeatUnitTest);
    }

    /* Deep Copy vs Shallow Copy
     * Deep Copy
     * If the Class has inner Class objects, we need to create a new object passing the existing object as the argument.
     * This is deep copy. Going as deep as possible till the last inner class.
     *
     * Shallow Copy:
     * Just assign the reference of the existing object to the new object that is created.
     * Both of the reference variables will point to the same object.
     */


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
