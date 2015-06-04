package task25;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

public class TaskTest {
    public static void main(String[] args) {
        BankCard accountCard = new AccountCard("Maestro", 8000000);
        BankCard creditCard = new CreditCard("Visa", 10000000, 5.5);
        BankCard overdraftCard = new OverdraftCard("MasterCard", 5000000, 3);
        System.out.println("Account card: " + accountCard.getPaymentSystem() + " "
                + ((AccountCard) accountCard).getCashInBankAccount());
        System.out.println("Credit card: " + creditCard.getPaymentSystem() + " "
                + ((CreditCard) creditCard).getCreditCash() + " " + ((CreditCard) creditCard).getCreditPercent());
        System.out.println("Overdraft card: " + overdraftCard.getPaymentSystem() + " "
                + ((OverdraftCard) overdraftCard).getCashInBankAccount() + " " + ((OverdraftCard) overdraftCard).getRepaymentPeriod());
    }
}
