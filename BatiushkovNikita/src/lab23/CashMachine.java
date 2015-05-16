package lab23;

public class CashMachine {
    private final int VALUE_20 = 20;
    private final int VALUE_50 = 50;
    private final int VALUE_100 = 100;

    private int numBanknotes20;
    private int numBanknotes50;
    private int numBanknotes100;

    public CashMachine(int numBanknotes20, int numBanknotes50, int numBanknotes100) {
        this.numBanknotes20 = numBanknotes20;
        this.numBanknotes50 = numBanknotes50;
        this.numBanknotes100 = numBanknotes100;
    }

    public boolean getMoney(int amountOfMoney) {
        if (amountOfMoney == 0) {
            return true;
        } else {
            for (int i : new int[]{VALUE_20, VALUE_50, VALUE_100}) {
                if (amountOfMoney >= i && getMoney(amountOfMoney - i)) {
                    System.out.println(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int getNumBanknotes20() {
        return numBanknotes20;
    }

    public void setNumBanknotes20(int numBanknotes20) {
        this.numBanknotes20 = numBanknotes20;
    }

    public int getNumBanknotes50() {
        return numBanknotes50;
    }

    public void setNumBanknotes50(int numBanknotes50) {
        this.numBanknotes50 = numBanknotes50;
    }

    public int getNumBanknotes100() {
        return numBanknotes100;
    }

    public void setNumBanknotes100(int numBanknotes100) {
        this.numBanknotes100 = numBanknotes100;
    }

}
