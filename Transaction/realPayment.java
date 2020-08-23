import org.apache.commons.lang3.RandomStringUtils;

public abstract class realPayment {

    private String IBANLength = RandomStringUtils.randomNumeric(18);
    private String senderName;
    private String senderCountryCode;
    private String senderCurrency;
    private String receiverName;
    private String receiverCountryCode;
    private String receiverCurrency;
    private double moneyAmount;
    private String paymentDescription;

    public realPayment(String senderName, String senderCountryCode, String senderCurrency, String receiverName, String receiverCountryCode, String receiverCurrency, double moneyAmount, String paymentDescription) {
        this.senderName = senderName;
        this.senderCountryCode = senderCountryCode;
        this.senderCurrency = senderCurrency;
        this.receiverName = receiverName;
        this.receiverCountryCode = receiverCountryCode;
        this.receiverCurrency = receiverCurrency;
        this.moneyAmount = moneyAmount;
        this.paymentDescription = paymentDescription;
    }

    public String getSenderCountryCode() {
        return senderCountryCode;
    }

    public String getReceiverCountryCode() {
        return receiverCountryCode;
    }

    public String getSenderCurrency() {
        return senderCurrency;
    }

    public String getReceiverCurrency() {
        return receiverCurrency;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public String getIBANLength() {
        return IBANLength;
    }


    public abstract String createSenderFullIBAN();
    public abstract double calculateTotalAmount();
    public abstract String createReceiverIBAN();

    @Override
    public String toString() {
        return  "▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼" + '\n' +
                "Payment information: " + '\n' +
                "Sender name: " + senderName + '\n' +
                "Sender country code: " + senderCountryCode + '\n' +
                "Sender currency: " + senderCurrency + '\n' +
                "Receiver name: " + receiverName + '\n' +
                "Receiver country code: " + receiverCountryCode + '\n' +
                "Receiver currency: " + receiverCurrency + '\n' +
                "Money amount: " + moneyAmount + '\n' +
                "Payment description: " + paymentDescription + '\n' +
                "Sender IBAN: " + createSenderFullIBAN() + '\n' +
                "Receiver IBAN: " + createReceiverIBAN() + '\n' +
                "Total amount: " + calculateTotalAmount() + '\n' +
                "Transaction fee: " + (calculateTotalAmount() - moneyAmount) + " " + senderCurrency + '\n' +
                "▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲" + '\n';
    }
}