package IntroToOOP.V4_CopyConstructors;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        /*
         * The student entity (class) will come into existence when the object of that class is created.
         * x is a Student type, reference variable that will store the address of the created object.
         */

        Student s1 = new Student();

        /*
         * To access and modify private values, we have the getter and setter functions.
         * These functions will be defined in the Student class and
         * these can access these private values since they are in the same Class, Student.
         * We just need to call these functions with appropriate parameters from the Client class.
         */

//        Student s1 = new Student("Praveen Reddy", 23, "Sep23", 79, 90);
//        System.out.println("\n\nname: " + s1.getName());
//        System.out.println("age: " + s1.age);
//        System.out.println("batch: " + s1.batch);
//        System.out.println("psp: " + s1.psp);
//        System.out.println("attPer: " + s1.attPer);

        System.out.println("\n\ns1.name: " + s1.getName());
        System.out.println("s1.age: " + s1.age);
        System.out.println("s1.batch: " + s1.batch);
        System.out.println("s1.psp: " + s1.psp);
        System.out.println("s1.attPer: " + s1.attPer);
        System.out.println("s1.UnitTest: " + s1.unitTest);
        // System.out.println("s1.RepeatUnitTest: " + s1.repeatUnitTest);


        // Creating a new student using the Copy Constructor
        Student s2 = new Student(s1);

        System.out.println("\n\ns2.name: " + s2.getName());
        System.out.println("s2.age: " + s2.age);
        System.out.println("s2.batch: " + s2.batch);
        System.out.println("s2.psp: " + s2.psp);
        System.out.println("s2.attPer: " + s2.attPer);
        System.out.println("s2.UnitTest: " + s2.unitTest);
        // System.out.println("s2.RepeatUnitTest: " + s2.repeatUnitTest);
    }
}
