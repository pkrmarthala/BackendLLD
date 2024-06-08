package Constructors;

import IntroToOOP.Student;

public class Client {
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

    public static void main(String[] args) {

        /* The below line to create the Student object will not work unless the Student Constructor is made public.
         *
         * Error:
         * java: Student() is not public in IntroToOOP.Student; cannot be accessed from outside package
         */

        Student x = new Student();

        x.setName("Simba");
        x.age = 10;  // age is made public

        System.out.println("x.name: " + x.getName());
        System.out.println("x.age: " + x.age);

    }
}
