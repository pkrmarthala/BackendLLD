package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        /* We cannot create multiple threads for each different task in the program.
         * Creation of thread itself is a overhead (would take time).
         * Also, if we have 50k things to do,
         * the system will be context switching between these 50k threads, which is also a overload on the CPU.
         *
         * To manually execute a thread pool, we need to maintain
         * - the Thread Queue which will hold the waiting tasks in it.
         * - threading mechanism
         * - thread allocation
         *
         * This will take a good amount of effort if you wanna do.
         *
         * Alternate Option: ExecutorService
         * Instead of having a new thread for every task, we can use these threads and get the task done.
         *
         * FixedThreadPool:
         * - generates a fixed number of threads that we want.
         * - Suggested thread count would be twice the number of cores.
         *
         * CachedThreadPool:
         * - This will create a new thread when all the previous threads are busy in executing tasks.
         * - If any of the  thread is free, new task will be allocated to that.
         * - Not suitable for bigger tasks.
         * - Since that big task will take much time, the cachedThreadPool most likely create noOfThreads = noOfTasks.
         */

        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++){
            if(i == 80) {
                System.out.println(" ");
            }
            NumberPrinter x1 = new NumberPrinter(i);
            es.execute(x1);
        }
    }
}

// Step 1: Create a class for the task to be executed by the thread.
// Step 2: Implement Runnable interface.
// Step 3: Give the run() definition in the class.
// Step 4: Create the object of this class and pass it to constructor of the Thread
// Step 5: threadObject.start();