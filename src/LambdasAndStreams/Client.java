package LambdasAndStreams;

// Functional Interfaces: Interfaces that have a single abstract method.
// Runnable     -> run()
// Callable     -> call()
// Comparable   -> compareTo()
// Comparator   -> compare()

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        // Descending Order
        Collections.sort(l1,(o1, o2) -> {
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
        System.out.println(l1);
        System.out.println(" ");
        System.out.println(" ");

        /* ------------------------------------------------------------------------------------------ */

        // StreamAPI
        // There will not be any effect on the original Collection if a Stream is used to process the data inside it.
        // It holds a copy of the data
        List<Integer> l2 = List.of(5, 10, 2, 1, 16, 3, 8, 1, 2, 2);

        // To create a stream from any collection, we need to
        // Syntax: Collections.stream();

        Stream<Integer> s1 = l2.stream();
        s1.forEach(System.out::println);
        // forEach() is a kind of terminal method of Streams.
        // As soon as we use the terminal methods, the stream wil be closed.
        // The pipe established to process the data will be closed.

        System.out.println(" ");

        // limit: limits to the first n number of elements in the given data. n is the parameter passed.
        // limit is an intermediate function.
        // Every intermediate function returns a stream.

        // s1.limit(4).forEach((elem) -> System.out.println(3*elem));
        // Error: stream has already been operated upon or closed

        l2
            .stream()
            .limit(4)
            .forEach(
                (elem) ->
                System.out.println(3*elem)
            );
        // or
//        Stream<Integer> s3 = l2.stream().limit(4);
//        s3.forEach((elem) -> System.out.println(3*elem));

        // filter(): Intermediary method. Returns stream
        // Takes the input data one by one and tries to filter it based on a certain condition.
        // accepts a functional interface, which goes through one by one.
        // Predicate interface has a test() method which takes the element and returns a boolean true or false.
        // true -> considers the element
        // false -> filters out the element

        List<Student> students = new ArrayList<>();
        students.add(new Student(25, 65.0, "Mohit", 10.0));
        students.add(new Student(21, 78.0, "Nidhi", 100.0));
        students.add(new Student(28, 20.0, "Kanu", 90.0));

        System.out.println(" ");
        students
                .stream()
                .filter( (elem) -> {
                            return elem.attendance > 80.0;
                        })
                .forEach( (elem) -> {
                    System.out.println(elem.name + " " + elem.attendance);
                });

        // To collect the o/p to a list:
        // collect() is a terminal function

        List<Student> l3 =
                students
                .stream()
                .filter( (elem) -> {
                    return elem.attendance > 80.0;
                }).collect(Collectors.toList());

        Set<Student> s2 =
                students
                        .stream()
                        .filter( (elem) -> {
                            return elem.attendance > 80.0;
                        }).collect(Collectors.toSet());

        // We have to type case to implement below.
        ArrayList<Student> s3 =
                (ArrayList<Student>) students
                        .stream()
                        .filter( (elem) -> {
                            return elem.attendance > 80.0;
                        }).collect(Collectors.toList());


        // map(): intermediate method
        // transforms your data into a corresponding data based on the logic
        // also expects a functional interface. So, use a lambda

        List<Student> l4 = students
                .stream()
                .filter( (elem) -> {
                    return elem.attendance > 80.0;
                })
                .map((elem) -> {
                     elem.psp = elem.psp + 10.0;
                     return elem;
                }).collect(Collectors.toList());


        System.out.println(" ");
        for (Student s : l4) {
            System.out.println(s.name + " " + s.psp);
        }


        List<Integer> l5 =
            l2.
            stream()
            .filter(
                (elem) -> elem % 2 == 0)
            .map(
                (elem) -> { return elem*elem; } )
            .collect(Collectors.toList());

        System.out.println(" ");
        System.out.println(l5);

        // distinct():
        // sorted():
        List<Integer> l6 =
                l2.
                    stream()
                    .distinct()
                    .filter(
                            (elem) -> elem % 2 == 0)
                    .map(
                            (elem) -> { return elem*elem; } )
                    .sorted((o1, o2) ->  (o2 - o1))
                    .collect(Collectors.toList());

        System.out.println(" ");
        System.out.println(l6);

        l6.add(null);
        l6.add(null);
        l6.add(null);
        List<Integer> l7 =
            l6.
                stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(" ");
        System.out.println(l7);


        Optional<Integer> op1 =
            l7
            .stream().distinct()
            .filter((elem) -> {
                System.out.println("Filtering " + elem);
                return elem % 2 == 0;
            })
            .map((elem) -> {
                System.out.println("Mapping " + elem);
                return elem * elem;
            })
            .findFirst(); // findFirst() will return the very first element

//        if(op1.isPresent()) {
//            System.out.println(op1.get());
//        }
        op1.ifPresent(System.out::println); // :: is called method reference







    }
}
