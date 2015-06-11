package task25;

public class OverdraftCard extends AccountCard {
    private int repaymentPeriod;

    public OverdraftCard(String paymentSystem, int cashInBankAccount, int repaymentPeriod) {
        super(paymentSystem, cashInBankAccount);
        this.repaymentPeriod = repaymentPeriod;
    }

    public int getRepaymentPeriod() {
        return repaymentPeriod;
    }
}
