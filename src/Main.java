public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long amount = 1_000_000;
        int loanTerm = 12;
        float interestRate = 9.99F;

        long payment = service.calculate(amount,loanTerm, interestRate);
        System.out.println(payment);

        loanTerm = 24;
        payment = service.calculate(amount,loanTerm, interestRate);
        System.out.println(payment);

        loanTerm = 36;
        payment = service.calculate(amount,loanTerm, interestRate);
        System.out.println(payment);
    }
}
