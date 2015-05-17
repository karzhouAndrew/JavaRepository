package task25;

public class AccountCard extends BankCard {
    private int cashInBankAccount;

    public AccountCard(String paymentSystem, int cashInBankAccount) {
        super(paymentSystem);
        this.cashInBankAccount = cashInBankAccount;
    }

    public int getCashInBankAccount() {
        return cashInBankAccount;
    }
}
