public class CreditPaymentService {
    public long calculate(long amount, int loanTerm, float interestRate){
        float interestRateMonth = interestRate / (100 * 12);
        double x = Math.pow(1 + interestRateMonth, -loanTerm);
        double payment = amount * interestRateMonth / (1 - x);
        long result = (long)payment;


        return result;
    }
}
