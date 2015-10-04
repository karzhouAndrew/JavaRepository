package lab25;

public class EliteIndividCard extends IndividualCard implements MemoryChipSupporting {

    private double interestOnDeposits;

    public EliteIndividCard(long cardNumber, String bankName, String ownerName, double interestOnDeposits) {
        super(cardNumber, bankName, ownerName);
        this.interestOnDeposits = interestOnDeposits;
    }

    @Override
    public void activateOffLineOperation() {
        System.out.println("Уважаемый " + super.getOwnerName() + ", выполняем операцию с процентной ставкой " + interestOnDeposits + " по вкладу без обращения к банку");
    }

    @Override
    public void activateRequest() {
        super.activateRequest();
        System.out.println("Выполняем on-line операцию с процентной ставкой " + interestOnDeposits + " по вкладу...");
    }

    public double getInterestOnDeposits() {
        return interestOnDeposits;
    }

    @Override
    public String toString() {
        return super.toString() + " процент по вкладу = " + interestOnDeposits;
    }
}
