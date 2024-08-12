package AdapterDesignPattern.Adapterv0Tight;

public class PhonePeLoan {
    public boolean loanCheck(YesBankAPI yb) {
        return yb.getBalance() > 100;
    }
}
