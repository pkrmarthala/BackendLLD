package AdapterDesignPattern.Adapterv1Loose;

public class ICICIBankAPI {
    public int balanceCheck() {
        return 1000;
    }

    public void sendMoney(int amount) {
        System.out.println(amount + "is transferred through ICICIBank");
    }
}
