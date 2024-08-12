package AdapterDesignPattern.Adapterv1Loose;

public class YesBankAPI {

    int transferAmount;
    public int getBalance() {
        return 100;
    }

    public void moneyTransfer() {
        System.out.println("Money is transferred via YesBank!");
    }

    public void setTransferAmount(int amount) {
        transferAmount = amount;
    }
}
