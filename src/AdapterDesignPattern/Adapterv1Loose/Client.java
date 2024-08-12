package AdapterDesignPattern.Adapterv1Loose;

import java.util.Scanner;

public class Client {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String bankAPIName = sc.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankAPIName);
        PhonePe p = new PhonePe();
        p.setBankAPI(bankAPI);
    }
}
