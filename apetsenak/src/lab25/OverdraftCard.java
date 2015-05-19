package lab25;


public class OverdraftCard extends DebitCard {
    private int debt;
    private double percent;

    public OverdraftCard(String cardNumber, String cardType, String bankName, String cardSpecification, int accountMoney, double percent) {
        super(cardNumber, cardType, bankName, cardSpecification, accountMoney);
        this.debt = 0;
        this.percent = percent;
    }

    @Override
    public void withdrawMoney(int amount) {
        if (amount <= getAccountMoney()) {
            setAccountMoney(getAccountMoney() - amount);
        } else {
            debt += (amount - getAccountMoney()) * (1 + percent / 100);
            setAccountMoney(0);
        }
    }

    @Override
    public void putMoney(int amount) {
        if (amount > debt) {
            super.putMoney(amount - debt);
            debt = 0;
        } else {
            debt -= amount;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nЗадолженность= " + debt +
                "\nПроцент= " + percent;
    }
}
