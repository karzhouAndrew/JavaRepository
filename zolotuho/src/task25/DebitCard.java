package task25;

enum Currency {BLR, USD, EU, RUB}

public abstract class DebitCard extends PaymentCard {
    private long balance;
    private long overdraft;
    private Currency currency;

    public void cashMoney(long sum) {
        if (getBalance() - sum >= 0) {
            setBalance(getBalance() - sum);
        } else {
            setOverdraft(sum - getBalance());
        }
    }

    void payBill(long sum) {
        if (getBalance() - sum >= 0) {
            setBalance(getBalance() - sum);
            System.out.println("successful payment");
        } else {
            System.out.println("insufficient balance");
        }
    }

    public void showBalance() {
        System.out.println(getCardID() + " = " + getBalance());
    }

    public void changeCurrency(Currency currency, double currencyRate) {
        setCurrency(currency);
        setBalance((long) (getBalance() * currencyRate));
    }

    public DebitCard(String bankName, long cardID, long balance, long overdraft, Currency currency) {
        super(bankName, cardID);
        this.balance = balance;
        this.overdraft = overdraft;
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(long overdraft) {
        this.overdraft = overdraft;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

