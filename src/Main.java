public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        //double interestRate = 9.99; // процентная ставка в процентах
        // int amountCredit = 1_000_000; // сумма кредита
        // int creditTerm = 12 ; // срок кредита в месяцах
        int mouthPaymentOne = service.calculate(9.99, 1_000_000, 12); // ежемесячный платеж
        int mouthPaymentTwo = service.calculate(9.99, 1_000_000, 24); // ежемесячный платеж
        int mouthPaymentThree = service.calculate(9.99, 1_000_000, 36); // ежемесячный платеж

        System.out.println("Ежемесячный платеж на 12 месяцев: " + mouthPaymentOne);
        System.out.println("Ежемесячный платеж на 24 месяца: " + mouthPaymentTwo);
        System.out.println("Ежемесячный платеж на 36 месяцев: " + mouthPaymentThree);
    }
}
