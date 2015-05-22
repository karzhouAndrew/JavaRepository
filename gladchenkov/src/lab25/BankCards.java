package lab25;

public class BankCards {
    private String cardHolderName;
    private String bankName;
    private String cardNumber;
    private String expirationDate;

    public BankCards(String cardHolderName, String bankName, String cardNumber, String expirationDate) {
        this.cardHolderName = cardHolderName;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "BankCards: " +
                "cardHolderName = " + cardHolderName +
                ", bankName = " + bankName +
                ", cardNumber = " + cardNumber +
                ", expirationDate = " + expirationDate + '}';
    }
}
