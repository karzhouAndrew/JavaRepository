package lab25;


public class FatherCard extends DebetCard implements VisaGold {
    private String bankName;

    public FatherCard(int cardNumber, double money, int interestPerDay, int moneyLimit, String bankName) {
        super(cardNumber, money, interestPerDay, moneyLimit);
        this.bankName = bankName;
    }


    @Override
    public double airportDiscont(double ticketCost) {
        double ticketdiscount = ticketCost * discount / 100;
        return ticketdiscount;
    }

    @Override
    public void falconeLunchDiscount() {

    }

    @Override
    public void stadiumVIPLodgeAccess() {

    }

    @Override
    public String toString() {
        return "FatherCard{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}
