package lab25;


public class CreditCard extends BankCard implements CardWork {
    private int availableFunds;
    private double percent;
    private int debt;

    public CreditCard(String cardNumber, String cardType, String bankName, String cardSpecification, int availableFunds, double percent) {
        super(cardNumber, cardType, bankName, cardSpecification);
        this.availableFunds = availableFunds;
        this.debt = availableFunds + (int) (availableFunds * (percent / 100));
        this.percent = percent;
    }

    @Override
    public void withdrawMoney(int amount) {
        if (amount > availableFunds) {
            System.out.println("Запрошенная сумма больше доступной. Доступная - " + debt);
        } else {
            availableFunds -= amount;
        }
    }

    @Override
    public void putMoney(int amount) {
        if (amount > debt) {
            System.out.println("Сумма платёжа больше задолженности. Задолженность - " + debt);
        } else {
            debt -= amount;
            if (debt == amount) {
                System.out.println("Зажолженность погашена.");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nДоступные средства= " + availableFunds +
                "\nПроцент= " + percent +
                "\nЗадолженность= " + debt;
    }
}
