package task25;

public class TestCards {
    public static void main(String[] args) {
        PaymentCard paymentCard = new MasterCard("Prior", 1234568343, 3000, 0, Currency.USD, 5);
        PaymentCard paymentCard1 = new Visa("BPS", 900589889, 60000, 0, Currency.EU, 1);
        Visa visa = new Visa("Idea", 578599474, 50000, 0, Currency.EU, 1);
        PaymentCard paymentCard2;
        paymentCard2 = visa;
        paymentCard1.showBalance();
        paymentCard2.showBalance();
        paymentCard1.transferToAnotherCard(5000, paymentCard2);
        paymentCard1.showBalance();
        paymentCard2.showBalance();
    }
}
