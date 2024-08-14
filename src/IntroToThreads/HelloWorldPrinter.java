package IntroToThreads;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World! " + Thread.currentThread().getName());
    }
}

// We cannot return anything from the run() function. So, there exists Callable interface
// ThreadPool: ExecutorService