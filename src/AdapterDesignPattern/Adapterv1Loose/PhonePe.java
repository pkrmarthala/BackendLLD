package AdapterDesignPattern.Adapterv1Loose;

public class PhonePe {

    BankAPI bankAPI;

    void setBankAPI(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    PhonePeLoan pl = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    public boolean checkLoanEligibility() {
        return pl.loanCheck(bankAPI);
    }

    public boolean rechargeFastTag() {
        if(ft.rechargeFastTag(bankAPI, 1000) > 0) {
            return true;
        }
        else {
            throw new RuntimeException("Add more funds!");
        }
    }
}
