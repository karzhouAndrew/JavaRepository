package lab23;

public class CashMachine {
    private final int VALUE_20 = 20;
    private final int VALUE_50 = 50;
    private final int VALUE_100 = 100;

    private int numAmount20;
    private int numAmount50;
    private int numAmount100;
    private int numIssued20;
    private int numIssued50;
    private int numIssued100;
    private int[] arrAmount;
    private int[] arrValues = {VALUE_100, VALUE_50, VALUE_20};
    private int[] arrIssued = {numIssued100, numIssued50, numIssued20};

    public CashMachine(int numAmount100, int numAmount50, int numAmount20) {
        this.numAmount100 = numAmount100;
        this.numAmount50 = numAmount50;
        this.numAmount20 = numAmount20;
        this.arrAmount = new int[]{numAmount100, numAmount50, numAmount20};
    }

    public void addMoney(int numBanknotes100, int numBanknotes50, int numBanknotes20) {
        arrAmount[0] += numBanknotes100;
        arrAmount[1] += numBanknotes50;
        arrAmount[2] += numBanknotes20;
    }

    private boolean executeTransaction(int amountMoney) {
        if (amountMoney == 0) {
            return true;
        } else {
            for (int i = 0; i < arrValues.length; i++) {
                int value = arrValues[i];
                if (amountMoney >= i && executeTransaction(amountMoney - value)) {
                    if (arrAmount[i] > 0) {
                        arrAmount[i]--;
                        arrIssued[i]++;
                    } else {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void viewTransaction(int amountMoney) {
        System.out.println("The required amount: " + amountMoney);
        if (executeTransaction(amountMoney)) {
            System.out.println("Transaction is possible.");
            System.out.println("Take your money:");
            System.out.println("100: " + arrIssued[0]);
            System.out.println("50: " + arrIssued[1]);
            System.out.println("20: " + arrIssued[2]);
        } else {
            System.out.println("Sorry. Transaction is not possible.");
        }
    }
}
