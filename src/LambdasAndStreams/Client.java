package LambdasAndStreams;

// Functional Interfaces: Interfaces that have a single abstract method.
// Runnable     -> run()
// Callable     -> call()
// Comparable   -> compareTo()
// Comparator   -> compare()

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Method #1:
        // Runnable: A single class which implements Runnable interface, run() method.

        // Method #2:
        // Anonymous class which does not have any name
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        };

        Thread t = new Thread(r);
        t.start();
        // We can avoid creating the class just to implement Runnable interface and run().


        // Method #3:
        // Lambda Expressions: are for functional interfaces (interfaces that have only one method).
        // These are shorter form of code. Kinda syntactical sugar for functional interfaces.
        // These are used to create quick objects, without creating specific classes of functional interfaces,

        // Syntax: Runnable r2 = (arguments if any) -> {body of the run function};
        Runnable r2 = () -> {
            System.out.println("Hello World LambdaExpression");
        };

        // The above line creates an object that implements the Runnable interface,
        // which has the definition that we gave in the body for that run() method.

        Thread t2 = new Thread(r2);
        t2.start();

        /* Instead of creating the Runnable object in one LOC through the lambda expression,
         * and then passing it to the Thread, We can straight away do the below.
         *
         * The thread constructor will expect the Runnable object.
         * Expression inside the thread object constructor call (the Lambda XP) will be automatically converted to a
         * Runnable object, the body going to the run() function.
         */

        Thread t3 = new Thread(() -> System.out.println("Direct and shorter Code!"));
        t3.start();


        // Syntax:
        // Thread t4 = new Thread(() -> {});
        // We can avoid the curly braces since there is only one line of code (LOC)


        // Comparator: functional interface
        // compare(O1, O2)
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Descending Order
        Collections.sort(list,(o1, o2) -> {
            if(o1 > o2) {
                return -1;
            } else if(o1 < o2) {
                return 1;
            } else {
                return 0;
            }
        });

        // Object of an anonymous class (class without a name) will be created
        // and will be assigned to Runnable interface reference variable.
        System.out.println(list);










    }
}
