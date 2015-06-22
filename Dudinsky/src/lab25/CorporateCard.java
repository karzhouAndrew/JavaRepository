package lab25;

public abstract class CorporateCard extends BankCard {

    private String corporationName;

    public CorporateCard(long cardNumber, String bankName, String corporationName) {
        super(cardNumber, bankName);
        this.corporationName = corporationName;
    }

    @Override
    public void activateRequest() {
        System.out.println("Запрос предприятия " + corporationName + ", выполняется on-line соединение...");
        System.out.println("Передаю в терминал: банк '" + super.getBankName() + '\'' + ", карта номер " + super.getCardNumber());
    }

    public String getCorporationName() {
        return corporationName;
    }

    @Override
    public String toString() {
        return super.toString() + ", наименование юридического лица (владельца) = '" + corporationName + '\'';
    }
}
