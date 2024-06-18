package IntroToOOP.V1_Basic_OOP;

public class Client {
    public static void main(String[] args) {
        /*
         * The student entity (class) will come into existence when the object of that class is created.
         * x is a Student type, reference variable that will store the address of the created object.
         */

        Student x = new Student();

        x.name = "Simba";
        x.age = 10;
        x.psp = 76.0;
        x.attPer = 90.0;

        // . operator will be used to access the attributes or the methods of the object that calls them (x in this case)
        System.out.println("x.name: " + x.name);
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

    }
}
