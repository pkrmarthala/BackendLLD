package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter x = new HelloWorldPrinter();
        System.out.println("Client main: " + Thread.currentThread().getName());
        Thread t = new Thread(x); // Abstraction
        // The Thread expects the Runnable object.
        // HelloWorldPrinter is a class that implements Runnable interface.
        // Hence, object of this class will be treated as object of Runnable interface.
        // Interface can refer to a class which implements that interface.

        x.run();
        t.start(); // internally it'll be calling x.run();

        for(int i = 1; i <= 100; i++){
            NumberPrinter x1 = new NumberPrinter(i);
            Thread t1 = new Thread(x1);
            t1.start();
        }
        // Order will not be followed.

        Thread t2 = new HelloWorld2();
        t2.start();
    }
}

// Step 1: Create a class for the task to be executed by the thread.
// Step 2: Implement Runnable interface.
// Step 3: Give the run() definition in the class.
// Step 4: Create the object of this class and pass it to constructor of the Thread
// Step 5: threadObject.start();