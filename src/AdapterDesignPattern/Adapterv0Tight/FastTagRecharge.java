package AdapterDesignPattern.Adapterv0Tight;

public class FastTagRecharge {
    public int rechargeFastTag(YesBankAPI yb, int amount) {
        if(yb.getBalance() >= amount) {
            System.out.println("Recharge Successful!");
            return 1;
        } else {
            System.out.println("Recharge Failed!");
        }
        return 0;
    }
}
