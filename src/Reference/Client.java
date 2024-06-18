package Reference;

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

        /* y is another reference variable that will hold the Student object.
         * Since the object reference x is assigned to it, it'll also point to x and
         * the attributes of y if changed, it affects the attributes of x as well since it is the same object BTS.
         */
        Student y = x;
        y.age += 10;
        System.out.println("x.age: " + x.age);

        /* z is another reference variable that will hold the Student object.
         * We created a new object but later assigned the y to z. So, z also will point to y and in turn to x
         * the attributes of z if changed, it affects the attributes of y and in turn those of x since it is the same object BTS.
         */

        Student z = new Student();
        z = y;
        z.age += 10;
        System.out.println("x.age: " + x.age);

        Student s1 = new Student("Praveen Reddy", 23, "Sep23", 79, 90);
        System.out.println("\n\nname: " + s1.getName());
        System.out.println("age: " + s1.age);
        System.out.println("batch: " + s1.batch);
        System.out.println("psp: " + s1.psp);
        System.out.println("attPer: " + s1.attPer);

        // Creating a new student using the Copy Constructor
        Student s2 = new Student(x);
        System.out.println("\n\ns2.name:" + s2.getName());
    }
}
