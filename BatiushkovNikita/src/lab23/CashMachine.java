package lab23;

import java.util.Arrays;

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
        int[] arrValues = {VALUE_100, VALUE_50, VALUE_20};
        int[] arrAmount = {numBanknotes100, numBanknotes50, numBanknotes20};
        if (amountOfMoney == 0) {
            return true;
        } else {
            for (int i = 0; i < arrValues.length; i++) {
                int value = arrValues[i];
                if (amountOfMoney >= i && getMoney(amountOfMoney - value)) {
                    reduceNumBanknotes(i);
                    return true;
                }
            }
        }
        return false;
    }

    int[] arrAmount = {numBanknotes100, numBanknotes50, numBanknotes20};
    public int[] reduceNumBanknotes(int value) {
        arrAmount[value]--;
        System.out.println(Arrays.toString(arrAmount));
        return arrAmount;
    }

    public void increaseNumBanknotes(int numBanknotes20, int numBanknotes50, int numBanknotes100) {
        this.numBanknotes20 += numBanknotes20;
        this.numBanknotes50 += numBanknotes50;
        this.numBanknotes100 += numBanknotes100;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "numBanknotes20=" + numBanknotes20 +
                ", numBanknotes50=" + numBanknotes50 +
                ", numBanknotes100=" + numBanknotes100 +
                '}';
    }

}
