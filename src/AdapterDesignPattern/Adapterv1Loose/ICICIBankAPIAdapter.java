package AdapterDesignPattern.Adapterv1Loose;

public class ICICIBankAPIAdapter implements BankAPI {

    ICICIBankAPI ib = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public void transferMoney(int amount) {
        ib.sendMoney(amount);
    }
}
