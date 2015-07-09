package task25;

enum Currency {
    BLR, USD, EU, RUB
}

public abstract class DebitCard extends PaymentCard {
    private long overdraft;
    private Currency currency;

    public void cashMoney(long sum) {
        if (getBalance() - sum >= 0) {
            setBalance(getBalance() - sum);
        } else {
            setOverdraft(sum - getBalance());
        }
    }

    public void changeCurrency(Currency currency, double currencyRate) {
        setCurrency(currency);
        setBalance((long) (getBalance() * currencyRate));
    }

    public DebitCard(String bankName, long cardID, long balance, long overdraft, Currency currency) {
        super(bankName, cardID, balance);
        this.overdraft = overdraft;
        this.currency = currency;
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

