package lab25;

public class Maestro extends CreditCard {
    private int amountCashEuro;

    public Maestro(int identificationNumber, String personalData, int amountCash) {
        super(identificationNumber, personalData);
        this.amountCashEuro = amountCash;
    }

    public int getAmountCash() {
        return amountCashEuro;
    }

    public void setAmountCash(int amountCash) {
        this.amountCashEuro = amountCash;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "amountCashEuro=" + amountCashEuro +
                '}';
    }
}
