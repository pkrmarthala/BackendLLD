package IntroToThreads;

public class HelloWorld2 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

// Runnable interface (preferred) vs extending Thread class
// Better to go with Runnable interface implementation.
// Since you've already extended one class, there'll not be any room left for extending another class.

// Even here, Thread class implements Runnable interface.
// So, you're implementing the Runnable interface via the thread.
// Composition (better) vs Inheritance