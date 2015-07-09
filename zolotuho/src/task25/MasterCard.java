package task25;

public class MasterCard extends DebitCard {
    private long discount;

    public MasterCard(String bankName, long cardID, long balance, long overdraft, Currency currency, long discount) {
        super(bankName, cardID, balance, overdraft, currency);
        this.discount = discount;
    }

    @Override
    public void payBill(long sum) {
        if (getBalance() - sum * discount / 100 >= 0) {
            setBalance(getBalance() - sum * discount / 100);
            System.out.println("successful payment");
        } else {
            System.out.println("insufficient balance");
        }
    }

    public void transferToAnotherCard() {
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public void transferToAnotherCard(long sum, PaymentCard paymentCard) {

    }
}
