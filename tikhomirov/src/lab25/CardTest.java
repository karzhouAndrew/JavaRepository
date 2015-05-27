package lab25;

/**
 * Создать иерархию классов, описывающих банковские карточки, минимум три уровня.
 */
public class CardTest {
    public static void main(String[] args) {
        FatherCard fatherCard = new FatherCard(123456, 100, 1, 9999999, "Belinvestbank");
        SysterCard systerCard = new SysterCard(654321, 115, 1000, 50, "Alfabank");
        System.out.println("Father card information: NUMBER: " + fatherCard.getCardNumber());
        System.out.println(fatherCard);
        System.out.println("Due to VisaGold Card You have saved " + fatherCard.airportDiscont(56) + " $ for the ticket");
        System.out.println("Syster card information: CURRENT SUM OF MONEY: " + systerCard.getMoney());
    }
}
