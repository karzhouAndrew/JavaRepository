package lab25;

public class VisaInfinite extends VisaElectron {
    private String insurance;
    private String support;

    public VisaInfinite(String cardHolderName, String bankName, String cardNumber, String expirationDate, String emvChip, String insurance, String support) {
        super(cardHolderName, bankName, cardNumber, expirationDate, emvChip);
        this.insurance = insurance;
        this.support = support;
    }

    @Override
    public String toString() {
        return super.toString() + "{insurance = " + insurance + ", support = " + support + '}';
    }
}

