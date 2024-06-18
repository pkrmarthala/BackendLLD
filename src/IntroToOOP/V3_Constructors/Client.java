package IntroToOOP.V3_Constructors;

import Reference.Student;

// A class is always public. Never protected or private. Inner classes can be protected.
public class Client {

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
     * One type of Constructor can have only one access modifier.
     *
     * We can have private, nested IntroToOOP.Constructors as well.
     *
     */

    public static void main(String[] args) {

        /* The below line to create the Student object will not work unless the Student Constructor is made public.
         *
         * Error:
         * java: Student() is not public in Reference.Student; cannot be accessed from outside package
         */

        Student x = new Student();

        x.setName("Simba");
        x.age = 10;  // age is made public

        System.out.println("x.name: " + x.getName());
        System.out.println("x.age: " + x.age);

    }
}
