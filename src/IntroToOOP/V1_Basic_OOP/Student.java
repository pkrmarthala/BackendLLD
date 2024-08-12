package IntroToOOP.V1_Basic_OOP;

public class Student {
    // Data Members
    // If we do not explicitly write any access modifier, it will be 'default'

    String name;
    int age;
    String batch;
    double psp;
    double attPer; // attendance percentage

    // Member functions

    void printStudent() {
        System.out.println("Name: " + name);
    }

    void attendClass() {
        System.out.println("Attend Class: " + attPer);
    }
}
