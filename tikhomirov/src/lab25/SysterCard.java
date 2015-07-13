package lab25;


public class SysterCard extends CreditCard implements VisaElectrone {
    private String bankName;

    public SysterCard(int cardNumber, double money, int maxSumOfCredit, int overdraftDuration, String bankName) {
        super(cardNumber, money, maxSumOfCredit, overdraftDuration);
        this.bankName = bankName;
    }

    @Override
    public void internetPayments() {

    }

    @Override
    public void abroadPayments() {

    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "SysterCard{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}
