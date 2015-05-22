package lab25;

public class MasterCardElectronic extends BankCards {
    private String contactlessChip;

    public MasterCardElectronic(String cardHolderName, String bankName, String cardNumber, String expirationDate, String contactlessChip) {
        super(cardHolderName, bankName, cardNumber, expirationDate);
        this.contactlessChip = contactlessChip;
    }

    @Override
    public String toString() {
        return super.toString() + "{contactlessChip = " + contactlessChip + '}';
    }
}
