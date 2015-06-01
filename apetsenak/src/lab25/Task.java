package lab25;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Task {
    public static void main(String[] args) {
        CardWork card = new CreditCard("0012 3243 1231 6732", "v", "Беларусбанк", "Credit card", 10000, 35);
        System.out.println(card);
        System.out.println("\nСнимаем 8000, кладём 7000.");
        card.withdrawMoney(8000);
        card.putMoney(7000);
        System.out.println(card);
        card = new OverdraftCard("3123 5345 1203 3453", "m", "Технобанк", "Overdraft card", 14523, 50);
        System.out.println(card);
        System.out.println("\nСнимаем 18000.");
        card.withdrawMoney(18000);
        System.out.println(card);
        System.out.println("\nКладём 10000.");
        card.putMoney(10000);
        System.out.println(card);
        card = new DebitCard("2131 2525 8586 5345", "b", "БПС-Сбербанк", "Debit card", 15000);
        System.out.println(card);
        System.out.println("\nСнимаем 18000.");
        card.withdrawMoney(18000);
        System.out.println(card);
    }
}
