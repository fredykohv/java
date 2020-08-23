import org.apache.commons.lang3.RandomStringUtils;

public class IBAN_TransactionFees extends Payment_Details {

    public IBAN_TransactionFees(String senderName, String senderCountryCode, String senderCurrency, String receiverName, String receiverCountryCode, String receiverCurrency, double moneyAmount, String paymentDescription) {
        super(senderName, senderCountryCode, senderCurrency, receiverName, receiverCountryCode, receiverCurrency, moneyAmount, paymentDescription);
    }

    @Override
    public String createSenderFullIBAN() {
        String senderIBAN = getSenderCountryCode() + getIBANLength();
        return senderIBAN;
    }

    @Override
    public double calculateTotalAmount() {
        double totalAmount;
        if (getReceiverCountryCode() == "EE" && getReceiverCurrency() == "EUR") {
            totalAmount = getMoneyAmount() + (getMoneyAmount() * 0.0001);
            return totalAmount;
        }

        else if (getReceiverCountryCode() == "US" && getReceiverCurrency() == "USD") {
            totalAmount = getMoneyAmount() + (getMoneyAmount() * 0.005);
            return totalAmount;
        }

        else {
            totalAmount = getMoneyAmount() + (getMoneyAmount() * 0.02);
            return totalAmount;
        }
    }

    @Override
    public String createReceiverIBAN() {
        String receiverIBAN;;

        if (getReceiverCountryCode() == "EE" || getReceiverCurrency() == "EUR") {
            receiverIBAN = getReceiverCountryCode() + getIBANLength();
            return receiverIBAN;
        } else {
            receiverIBAN = RandomStringUtils.randomAlphabetic(5) + RandomStringUtils.randomNumeric(2);
            receiverIBAN = receiverIBAN.toUpperCase();
            return receiverIBAN;
        }

    }


}
