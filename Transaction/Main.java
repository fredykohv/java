public class Main
{
    public static void main(String[] args)
    {
        paymentDetails details = new paymentDetails("Fredy Kohv", "EE", "EUR", "Timory Kohv", "EE", "EUR", 31, "test\n");
        paymentDetails details2 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Aaris Õis", "FIN", "EUR", 12, "test\n");
        paymentDetails details3 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Mark Kalda", "GER", "EUR", 101, "test\n");
        paymentDetails details4 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Margus Reintam", "EE", "EUR", 63, "test\n");
        paymentDetails details5 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Siim Ilves", "US", "USD", 16, "test\n");
        paymentDetails details6 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Helena Jäe", "US", "USD", 88, "test\n");
        paymentDetails details7 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Ami Sild", "RU", "RUB", 93, "test\n");
        paymentDetails details8 = new paymentDetails("Fredy Kohv", "EE", "EUR", "Teele Saul", "SWE", "KR", 178, "test\n");

        realPayment [] realP = {details, details2, details3, details4, details5, details6, details7, details8};

        for (realPayment realPayment : realP) {
            System.out.println(realPayment);
        }
    }
}
