package lab25;

/**
 * Лбщий класс для банковских карт
 */
public abstract class BankCard {
    private int count;
    private String ownerName;
    private int numberOfMoney;

    public void setCount(int count) {
        this.count = count;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setNumberOfMoney(int numberOfMoney) {
        this.numberOfMoney = numberOfMoney;
    }

    public int getCount() {
        return count;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getNumberOfMoney() {
        return numberOfMoney;
    }
}
