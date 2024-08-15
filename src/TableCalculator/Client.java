package TableCalculator;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++) {
            TableCreator tC = new TableCreator(n);
            Thread t = new Thread(tC);
            t.start();
        }
    }
}