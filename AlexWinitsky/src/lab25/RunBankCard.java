package lab25;

/**
 * Задание 25
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class RunBankCard {
    public static void main(String[] args) {
        SalaryCard salaryCard = new SalaryCard("SMS банк", "Интернет банк", 2);
        salaryCard.setCount(1321324564);
        salaryCard.setNameOfOrganization("ЗАО Анлант");
        salaryCard.setOwnerName("IAVAN IVANOV");
        salaryCard.setNumberOfMoney(1000000);
        System.out.println(salaryCard);

        System.out.println();
        BelCard belCard = new BelCard("Беларусь", "Ежемесечная выписка");
        belCard.setOwnerName("PAVEL PAVLOV");
        belCard.setCount(54652132);
        belCard.setPercentOfUseCard(5);
        belCard.setDayOfCreditRepayment("30-е число каждого месяца");
        belCard.setNumberOfMoney(2500000);
        System.out.println(belCard);


    }
}
