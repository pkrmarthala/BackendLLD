package AdapterDesignPattern.Adapterv1Loose;

public class FastTagRecharge {
    public int rechargeFastTag(BankAPI yb, int amount) {
        if(yb.checkBalance() >= amount) {
            System.out.println("Recharge Successful!");
            return 1;
        } else {
            System.out.println("Recharge Failed!");
        }
        return 0;
    }
}
