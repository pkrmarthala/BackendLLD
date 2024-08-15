package TableCalculator;

public class TableCreator implements Runnable {

    int n;

    TableCreator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " times " + i + " is " + n * i);
        }
    }
}