package lab25;

public class VisaElectron extends BankCards {
    private String emvChip;

    public VisaElectron(String cardHolderName, String bankName, String cardNumber, String expirationDate, String emvChip) {
        super(cardHolderName, bankName, cardNumber, expirationDate);
        this.emvChip = emvChip;
    }

    @Override
    public String toString() {
        return super.toString() + "{emvChip = " + emvChip + '}';
    }
}
