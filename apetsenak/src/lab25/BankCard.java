package lab25;


public abstract class BankCard {
    private String cardNumber;
    private CardType cardType;
    private String bankName;
    private String cardSpecification;

    public BankCard(String cardNumber, String cardType, String bankName, String cardSpecification) {
        this.bankName = bankName;
        this.cardType = CardType.valueOf(cardType.toUpperCase());
        this.cardSpecification = cardSpecification;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "\nКарта:" +
                "\nНомер карты: " + cardNumber +
                "\nНазвание банка: " + bankName +
                "\nТип карты: " + cardType +
                "\nВид карты: " + cardSpecification;
    }
}
