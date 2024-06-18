package IntroToOOP.V3_Constructors;

import Reference.Exam;
import Reference.ReattemptExam;

public class Student {
    // Data Members
    // If we do not explicitly write any access modifier, it will be 'default'

    // We cannot access the private members anywhere outside the class. Not even on the same package
    private String name;
    public int age;
    String batch;
    protected double psp;
    double attPer; // attendance percentage
    // unitTest is a reference variable of Exam Class.
    Exam unitTest;
    ReattemptExam repeatUnitTest;

    /* Constructor:
     * Constructor helps you to initialize the object.
     *
     * Java provides a default constructor if you have not defined any.
     * This default constructor will initialize the values of attributes depending on their datatypes.
     *
     * Java will never interfere if you define any constructor in your code.
     * Reason: If the programmer definitely want some parameters to be passed for object creation and
     * the constructor is already written in that way, but still the default constructor is available,
     * it will allow object creation without any parameters.
     *
     * We can write as many constructors as we want until the parameters passed or the order of those are different.
     */

    /*
     * Constructor with no parameters. Access Modifier: default.
     * This constructor cannot be accessed for object creation in any class outside this IntroToOOP.Constructors package,
     * unless it is made public
     */

//    Student() {
//        this.name = "A student";
//        this.age = 25;
//        this.batch = "new batch";
//        this.psp = 70.0;
//        this.attPer = 90.0;
//    }

    // Non-parametrized Constructor
    public Student() {
        this.name = "A student";
        this.age = 25;
        this.batch = "new batch";
        this.psp = 70.0;
        this.attPer = 90.0;
        // unitTest is a reference variable of Exam Class.
        this.unitTest = new Exam(1, 90);
        this.repeatUnitTest = new ReattemptExam(1, "UnitTest1", 80);
    }

    /* The missing parameters will be initialized to default values
     * based on the data type of the attribute by the Programming Language.
     *
     * Before the constructor is called,
     * all the attributes will be allocated a memory and their respective default values will be stored inside.
     *
     */

    // Parametrized IntroToOOP.Constructors below
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* 'this' keyword here means,
     * if an object is calling a constructor,
     * set the properties for this object same as the parameters passed.
     *
     * A constructor should not have more than 2 data members with same name.
     * Eg.: 1. this.name (object's name -> attribute or the data member)
     *      2. name (parameter passed)
     */

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    /* One type of Constructor can have only one access modifier.
     * We cannot write below Constructor since a 'public' Constructor of same type already exists.
     *
     * protected Student(String name, int age, String batch, double psp) {
     *   this.name = name;
     *   this.age = age;
     *   this.batch = batch;
     *   this.psp = psp;
     * }
     */

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
