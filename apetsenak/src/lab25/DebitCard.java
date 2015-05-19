package lab25;


public class DebitCard extends BankCard implements CardWork {
    private int accountMoney;

    public DebitCard(String cardNumber, String cardType, String bankName, String cardSpecification, int accountMoney) {
        super(cardNumber, cardType, bankName, cardSpecification);
        this.accountMoney = accountMoney;
    }

    public int getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(int accountMoney) {
        this.accountMoney = accountMoney;
    }

    @Override
    public void withdrawMoney(int amount) {
        if (amount > accountMoney) {
            System.out.println("Запрошенная сумма больше доступной.");
        } else {
            accountMoney -= amount;
        }
    }

    @Override
    public void putMoney(int amount) {
        accountMoney += amount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nСредства на счёте= " + accountMoney;
    }
}
