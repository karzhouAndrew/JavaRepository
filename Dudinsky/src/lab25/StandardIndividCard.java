package lab25;

public class StandardIndividCard extends IndividualCards {

    private int validityTerm;

    public StandardIndividCard(long cardNumber, String bankName, String ownerName, int validityTerm) {
        super(cardNumber, bankName, ownerName);
        this.validityTerm = validityTerm;
    }

    @Override
    public void activateRequest() {
        super.activateRequest();
        System.out.println("Передаю в банк год окончания срока действия карты: " + validityTerm);
    }

    public int getValidityTerm() {
        return validityTerm;
    }

    @Override
    public String toString() {
        return super.toString() + ", год окончания срока действия = " + validityTerm;
    }
}
