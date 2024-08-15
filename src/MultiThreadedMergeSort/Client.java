package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8, 1, 2, 9, 6, 3, 7, 5);

        // Sort this list using Merge Sort
        ExecutorService es = Executors.newFixedThreadPool(2);
        Sorter arraySorter = new Sorter(list);//, es);

        Future<List<Integer>> sortedArrayFuture = es.submit(arraySorter);
        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);

        // Instead of creating multiple ThreadPools again and again for every function call, we can pass it as well.
    }
}
