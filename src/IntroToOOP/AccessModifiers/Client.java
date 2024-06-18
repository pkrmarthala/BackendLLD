package IntroToOOP.AccessModifiers;

import Reference.Student;

public class Client {

    /* All the access modifiers are generally for the data members and the member functions only.
     * Not for classes or others.
     *
     * private      :   only within the class.
     * default      :   same class + same package : referred to as Package level protected.
     * protected    :   same class + same package + child class outside the package.
     * public       :   anywhere by anyone.
     */

    public static void main(String[] args) {
        /*
         * The student entity (class) will come into existence when the object of that class is created.
         * x is a Student type, reference variable that will store the address of the created object.
         */

        Student x = new Student();

        // private data members cannot be accessed outside the class.
        // Error: java: name has private access in Reference.Student

        /*
         * To access and modify private values, we have the getter and setter functions.
         * These functions will be defined in the Student class and
         * these can access these private values since they are in the same Class, Student.
         * We just need to call these functions with appropriate parameters from the Client class.
         */

        // We cannot access the setName() function from this Client class since it is in a diff package
        // The setName() should be made public inorder to access that from here.
        x.setName("Simba");

        // age and the other attributes below are default. Hence, we cannot access them in a different package.
        // we need to make them public to access them in this Client class which is in the
        x.age = 10;  // age is made public

        //Since psp is protected, we cannot access it in the other package.
        // x.psp = 76.0;

        // Since attPer is default, it cannot be accessed outside the package.
        // x.attPer = 90.0;

        // . operator will be used to access the attributes or the methods of the object that calls them (x in this case)
        System.out.println("x.name: " + x.getName());
        System.out.println("x.age: " + x.age);

    }
}
