package task25;

public abstract class PaymentCard {
    private final String bankName;
    private final long cardID;
    private long balance;

    public PaymentCard(String bankName, long cardID, long balance) {
        this.bankName = bankName;
        this.cardID = cardID;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println(getCardID() + " = " + getBalance());
    }

    public abstract void transferToAnotherCard(long sum, PaymentCard paymentCard);

    public String getBankName() {
        return bankName;
    }

    public long getCardID() {
        return cardID;
    }

    public void cashMoney(long sum) {
        if (balance - sum >= 0) {
            setBalance(balance - sum);
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void payBill(long sum) {
        if (balance - sum >= 0) {
            setBalance(balance - sum);
            System.out.println("successful payment");
        } else {
            System.out.println("insufficient balance");
        }
    }
}
