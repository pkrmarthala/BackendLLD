package AdapterDesignPattern.Adapterv0Tight;

public class PhonePe {
    /*
     * The PhonePe class is tightly coupled with YesBankAPI in every function.
     * In the future, if the bank is changed for some reason, we need to change
     * 1. the API object creation here
     * 2. the object that is passed to and received in all the functions
     * 3. the getBalance() method to the function that will be available in that new bankAPI
     */

    YesBankAPI yb = new YesBankAPI();
    PhonePeLoan pl = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    public boolean checkLoanEligibility() {
        return pl.loanCheck(yb);
    }

    public boolean rechargeFastTag() {
        if(ft.rechargeFastTag(yb, 1000) > 0) {
            return true;
        }
        else {
            throw new RuntimeException("Add more funds!");
        }
    }
}
