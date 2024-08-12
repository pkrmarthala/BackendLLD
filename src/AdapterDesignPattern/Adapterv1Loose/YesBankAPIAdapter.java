package AdapterDesignPattern.Adapterv1Loose;

public class YesBankAPIAdapter implements BankAPI{

    YesBankAPI yb = new YesBankAPI();

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public void transferMoney(int amount) {
        yb.setTransferAmount(amount);
        yb.moneyTransfer();
    }
}
