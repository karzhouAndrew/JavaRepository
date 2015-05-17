package lab23;

public class CashMachine {
/*    Money money20 = new Money();
    Money money50 = new Money();
    Money money100 = new Money();*/
    private final int VALUE_20 = 20;
    private final int VALUE_50 = 50;
    private final int VALUE_100 = 100;

    private int numBanknotes20;
    private int numBanknotes50;
    private int numBanknotes100;

    private static int count20 = 0;
    private static int count50 = 0;
    private static int count100 = 0;


    public CashMachine(int numBanknotes20, int numBanknotes50, int numBanknotes100) {
        this.numBanknotes20 = numBanknotes20;
        this.numBanknotes50 = numBanknotes50;
        this.numBanknotes100 = numBanknotes100;
    }

    public boolean getMoney(int amountOfMoney) {
        if (amountOfMoney == 0) {
            return true;
        } else {
            for (int i : new int[]{VALUE_100, VALUE_50, VALUE_20}) {
                if (amountOfMoney >= i && getMoney(amountOfMoney - i)) {
                    //System.out.println(i);
                    //System.out.println(Arrays.toString(MonetaryValue.values()));
                    //System.out.println(MonetaryValue.getValue());
                    reduceNumBanknotes(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void reduceNumBanknotes(int value) {
        switch (value) {
            case 20:
                count20();
                --numBanknotes20;
                break;
            case 50:
                count50();
                --numBanknotes50;
                break;
            case 100:
                count100();
                --numBanknotes100;
                break;
        }
    }

    public void increaseNumBanknotes(int numBanknotes20, int numBanknotes50, int numBanknotes100) {
        this.numBanknotes20 += numBanknotes20;
        this.numBanknotes50 += numBanknotes50;
        this.numBanknotes100 += numBanknotes100;
    }

    public static int count20() {
        count20++;
        return count20;
    }

    public static int count50() {
        count50++;
        return count50;
    }

    public static int count100() {
        count100++;
        return count100;
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
