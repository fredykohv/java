public class Transactions_Main
{
    public static void main(String[] args)
    {
        IBAN_TransactionFees details = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Timory Kohv", "EE", "EUR", 31, "test\n");
        IBAN_TransactionFees details2 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Aaris Õis", "FIN", "EUR", 12, "test\n");
        IBAN_TransactionFees details3 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Mark Kalda", "GER", "EUR", 101, "test\n");
        IBAN_TransactionFees details4 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Margus Reintam", "EE", "EUR", 63, "test\n");
        IBAN_TransactionFees details5 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Siim Ilves", "US", "USD", 16, "test\n");
        IBAN_TransactionFees details6 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Helena Jäe", "US", "USD", 88, "test\n");
        IBAN_TransactionFees details7 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Ami Sild", "RU", "RUB", 93, "test\n");
        IBAN_TransactionFees details8 = new IBAN_TransactionFees("Fredy Kohv", "EE", "EUR", "Teele Saul", "SWE", "KR", 178, "test\n");

        Payment_Details[] realP = {details, details2, details3, details4, details5, details6, details7, details8};

        for (Payment_Details Payment_Details : realP) {
            System.out.println(Payment_Details);
        }
    }
}
