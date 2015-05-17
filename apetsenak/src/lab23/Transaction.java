package lab23;


public class Transaction {
    private int hundredBillsNum;
    private int fiftyBillsNum;
    private int twentyBillsNum;

    public void setTwentyBillsNum(int twentyBillsNum) {
        this.twentyBillsNum = twentyBillsNum;
    }

    public void setFiftyBillsNum(int fiftyBillsNum) {
        this.fiftyBillsNum = fiftyBillsNum;
    }

    public void setHundredBillsNum(int hundredBillsNum) {
        this.hundredBillsNum = hundredBillsNum;
    }

    public int getTwentyBillsNum() {
        return twentyBillsNum;
    }

    public int getFiftyBillsNum() {
        return fiftyBillsNum;
    }

    public int getHundredBillsNum() {
        return hundredBillsNum;
    }

    public void devideAmount(int amount) {
        if (amount % 100 < 40 && amount % 100 != 20) {
            hundredBillsNum = amount / 100 - 1;
        } else {
            hundredBillsNum = amount / 100;
        }
        amount -= hundredBillsNum * 100;
        if (amount % 50 < 40 && amount % 50 != 20) {
            fiftyBillsNum = amount / 50 - 1;
        } else {
            fiftyBillsNum = amount / 50;
        }
        amount -= fiftyBillsNum * 50;
        twentyBillsNum = amount / 20;
    }

    @Override
    public String toString() {
        return "Transaction: " +
                "\nhundredBillsNum = " + hundredBillsNum +
                ",\nfiftyBillsNum = " + fiftyBillsNum +
                ",\ntwentyBillsNum = " + twentyBillsNum;
    }
}
