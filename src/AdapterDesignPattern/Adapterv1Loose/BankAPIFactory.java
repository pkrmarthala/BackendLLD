package AdapterDesignPattern.Adapterv1Loose;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankAPIName) {
        if (bankAPIName.equalsIgnoreCase("YesBank")) {
            return new YesBankAPIAdapter();
        }
        else if (bankAPIName.equalsIgnoreCase("ICICIBank")) {
            return new ICICIBankAPIAdapter();
        } else {
            throw new IllegalArgumentException("Your bank is not available at the moment.");
        }
    }
}
