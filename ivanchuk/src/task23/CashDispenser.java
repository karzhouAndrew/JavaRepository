package task23;

public class CashDispenser {
    private int[] banknotesQuantity;
    private int maxSumCash;
    private int[] gotBanknotes;
    private final Banknotes[] banknotes = Banknotes.values();

    public CashDispenser(int banknotesTwentyQuantity, int banknotesFiftyQuantity, int banknotesHundredQuantity) {
        banknotesQuantity = new int[banknotes.length];
        banknotesQuantity[0] = banknotesTwentyQuantity;
        banknotesQuantity[1] = banknotesFiftyQuantity;
        banknotesQuantity[2] = banknotesHundredQuantity;
        calculateMaxSumCash();
        gotBanknotes = new int[banknotes.length];
    }

    public void addBanknotes(int quantity) {
        for (int i = 0; i < banknotesQuantity.length; i++) {
            banknotesQuantity[i] += quantity;
        }
        calculateMaxSumCash();
    }

    public boolean possibleGetCash(int cashSum) {
        if (cashSum <= maxSumCash) {
            for (int i = banknotes.length - 1; i >= 0; i--) {
                gotBanknotes[i] = (cashSum - cashSum % banknotes[i].getFaceValue()) / banknotes[i].getFaceValue();
                if (gotBanknotes[i] > banknotesQuantity[i]) {
                    gotBanknotes[i] = banknotesQuantity[i];
                }
                cashSum -= gotBanknotes[i] * banknotes[i].getFaceValue();
            }
            return cashSum == 0;
        } else {
            return false;
        }
    }

    public StringBuilder getCash(int cashSum) {
        StringBuilder offer = new StringBuilder();
        if (this.possibleGetCash(cashSum)) {
            for (int i = 0; i < banknotes.length; i++) {
                offer.append(gotBanknotes[i]).append(" - ").append(banknotes[i].getStringValue()).append("; ");
            }
            for (int i = 0; i < banknotesQuantity.length; i++) {
                banknotesQuantity[i] -= gotBanknotes[i];
            }
            calculateMaxSumCash();
        } else {
            offer.append("Error");
        }
        return offer;
    }

    public int getMaxSumCash() {
        return maxSumCash;
    }

    private void calculateMaxSumCash() {
        maxSumCash = 0;
        for (int i = 0; i < banknotesQuantity.length; i++) {
            maxSumCash += banknotes[i].getFaceValue() * banknotesQuantity[i];
        }
    }
}
