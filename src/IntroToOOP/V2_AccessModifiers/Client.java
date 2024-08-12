package IntroToOOP.V2_AccessModifiers;

public class Client {
    public static void main(String[] args) {
        /*
         * The student entity (class) will come into existence when the object of that class is created.
         * x is a Student type, reference variable that will store the address of the created object.
         */

        Student x = new Student();

        /*
         * To access and modify private values, we have the getter and setter functions.
         * These functions will be defined in the Student class and
         * these can access these private values since they are in the same Class, Student.
         * We just need to call these functions with appropriate parameters from the Client class.
         */

        x.setName("Simba");
        x.age = 10;
        x.psp = 76.0;
        x.attPer = 90.0;

        // . operator will be used to access the attributes or the methods of the object that calls them (x in this case)
        System.out.println("x.name: " + x.getName());
        System.out.println("x.age: " + x.age);

    }
}
