package lab25;

/**
 * Класс зарплатные карты
 */
public class SalaryCard extends CorparateCard {
    private String smsService;
    private String internetService;
    private int numberOfAdditionalCard;

    public SalaryCard(String smsService, String internetService, int numberOfAdditionalCard) {
        this.smsService = smsService;
        this.internetService = internetService;
        this.numberOfAdditionalCard = numberOfAdditionalCard;
    }

    @Override
    public String toString() {
        return "SalaryCard{" +
                "Имя владельца=" + getOwnerName() + "\n" +
                ", Личный номер счета=" + getCount() + "\n" +
                ", Название организации=" + getNameOfOrganization() + "\n" +
                ", Счет организации=" + getCountOfOrganization() + "\n" +
                ", Сумма денег на карточке=" + getNumberOfMoney() + "\n" +
                ", SMS сервис='" + smsService + '\'' + "\n" +
                ", Интернет сервис='" + internetService + '\'' + "\n" +
                ", Количество дополнительный карточек=" + numberOfAdditionalCard + "\n" +

                '}';
    }
}
