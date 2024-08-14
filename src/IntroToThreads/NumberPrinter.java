package IntroToThreads;

public class NumberPrinter implements Runnable {
    int noToPrint = 0;

    NumberPrinter(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println(noToPrint + " " + Thread.currentThread().getName());
    }
}