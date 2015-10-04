package lab25;

public class PersonalizedCorpCard extends CorporateCard implements MemoryChipSupporting {

    private String employeeName;

    public PersonalizedCorpCard(long cardNumber, String bankName, String corporationName, String employeeName) {
        super(cardNumber, bankName, corporationName);
        this.employeeName = employeeName;
    }

    @Override
    public void activateOffLineOperation() {
        System.out.println("Уважаемый " + employeeName + ", выполняем операцию без обращения к банку");
    }

    @Override
    public void activateRequest() {
        super.activateRequest();
        System.out.println("Выполняем on-line операцию от имени сотрудника " + employeeName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return super.toString() + ", имя сотрудника = '" + employeeName + '\'';
    }
}
