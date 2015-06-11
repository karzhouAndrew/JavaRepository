package lab25;

public abstract class BankCards {

    private long cardNumber;
    private String bankName;

    public BankCards(long cardNumber, String bankName) {
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    public abstract void activateRequest();

    public String getBankName() {
        return bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Сведения о банковской карте:" +
                " класс карты = " + this.getClass() +
                ", номер карты = " + cardNumber +
                ", наименование банка = '" + bankName + '\'';
    }
}
