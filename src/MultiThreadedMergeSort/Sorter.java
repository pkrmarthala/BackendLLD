package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executor;

    public Sorter(List<Integer> arrayToSort) {// ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        // this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() == 1) {
            return arrayToSort;
        }
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>(arrayToSort.subList(0, mid));
        List<Integer> rightArray = new ArrayList<>(arrayToSort.subList(mid, arrayToSort.size()));

        // Instead of using subList, we can use the for loops like below.
//        for(int i = 0; i < mid; i++) {
//            leftArray.add(arrayToSort.get(i));
//        }
//
//        for(int i = mid + 1; i < arrayToSort.size(); i++) {
//            rightArray.add(arrayToSort.get(i));
//        }

        Sorter leftArraySorter = new Sorter(leftArray); //, executor);
        Sorter rightArraySorter = new Sorter(rightArray); //, executor);

        // if normal recursion,
        // leftArraySorter.call();
        // rightArraySorter.call();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Runnable -> execute()
        // Callable -> submit()

        // The sorted list will not be ready as soon as we pass it to the es.submit(). We have to wait to get it in return.
        // So, we need to use the futures.
//        List<Integer> l1 = es.submit(leftArraySorter);
//        List<Integer> l2 = es.submit(rightArraySorter);

        // Future is like a magic box. The data that comes in return will be automatically filled in this Future.
        Future<List<Integer>> leftArrayFuture = executor.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = executor.submit(rightArraySorter); // This will not wait for the above line to get executed.

        // merge: wait for the sorted arrays.
        // Waiting happens below.
        List<Integer> leftSortedArray = leftArrayFuture.get();
        List<Integer> rightSortedArray = rightArrayFuture.get();
        // The get() function will make the execution wait until the submit() is completed and is ready with the data.

        // merge logic

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i += 1;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j += 1;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i += 1;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j += 1;
        }

        return sortedArray;

    }
}
// The one who needs to sort the array will be creating a Sorter object and will be passing the array to sort.
// new Sorter(list);