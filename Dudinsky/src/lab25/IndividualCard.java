package lab25;

public abstract class IndividualCard extends BankCard {

    private String ownerName;

    public IndividualCard(long cardNumber, String bankName, String ownerName) {
        super(cardNumber, bankName);
        this.ownerName = ownerName;
    }

    @Override
    public void activateRequest() {
        System.out.println("Уважаемый " + ownerName + ", выполняется on-line соединение...");
        System.out.println("Передаю данные в терминал: банк '" + super.getBankName() + '\'' + ", карта номер " + super.getCardNumber());
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return super.toString() + ", имя владельца = '" + ownerName + '\'';
    }
}
