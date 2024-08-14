package Inheritance;

public class Client {
    public static void main(String[] args) {
        // User u = new User();

        // Whenever there is inheritance, the constructor will be called throughout the chain.
        // Since the child has properties of all of the above classes.
        // And only the parents know how to initialize those data members.
        Student s1 = new Student();

        System.out.println("");
    }
}

/* Order of Calling & Order of Execution:
 * Order of Calling:
 * - Student constructor will be called first.
 * - This Student constructor behind the scenes calls the parent constructor via "super()" and
 *   the chain repeats till the main parent.
 *
 * Order of Execution:
 * The execution starts from the main parent which has no further parents.
 */
