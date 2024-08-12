package AdapterDesignPattern.Adapterv1Loose;

public class PhonePeLoan {
    public boolean loanCheck(BankAPI yb) {
        return yb.checkBalance() > 100;
    }
}
