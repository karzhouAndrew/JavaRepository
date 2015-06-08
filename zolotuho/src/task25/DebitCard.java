package task25;

enum Currency {
    BLR, USD, EU, RUB
}

public abstract class DebitCard extends PaymentCard {
    private long balance;
    private long overdraft;
    private Currency currency;

    public void cashMoney(long sum) {
        if (balance - sum >= 0) {
            setBalance(balance - sum);
        } else {
            setOverdraft(sum - balance);
        }
    }

    void payBill(long sum) {
        if (balance - sum >= 0) {
            setBalance(balance - sum);
            System.out.println("successful payment");
        } else {
            System.out.println("insufficient balance");
        }
    }

    public void showBalance() {
        System.out.println(getCardID() + " = " + balance);
    }

    public void changeCurrency(Currency currency, double currencyRate) {
        setCurrency(currency);
        setBalance((long) (balance * currencyRate));
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

