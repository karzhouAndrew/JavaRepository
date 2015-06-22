package lab25;

public class ImpersonalCorpCard extends CorporateCard {

    private int validityTerm;

    public ImpersonalCorpCard(long cardNumber, String bankName, String corporationName, int validityTerm) {
        super(cardNumber, bankName, corporationName);
        this.validityTerm = validityTerm;
    }

    @Override
    public void activateRequest() {
        super.activateRequest();
        System.out.println("Напоминаем, последний год срока действия карты: " + validityTerm);
    }

    public int getValidityTerm() {
        return validityTerm;
    }

    @Override
    public String toString() {
        return super.toString() + ", год окончания срока действия = " + validityTerm;
    }
}
