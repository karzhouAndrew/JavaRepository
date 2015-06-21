package task23;

public class CashDispenser {
    private int[] banknotesQuantity;
    private int maxSumCash;
    private int[] gotBanknotes;
    private final Banknotes[] BANKNOTES = Banknotes.values();

    public CashDispenser(int banknotesTwentyQuantity, int banknotesFiftyQuantity, int banknotesHundredQuantity) {
        banknotesQuantity = new int[BANKNOTES.length];
        banknotesQuantity[0] = banknotesTwentyQuantity;
        banknotesQuantity[1] = banknotesFiftyQuantity;
        banknotesQuantity[2] = banknotesHundredQuantity;
        calculateMaxSumCash();
        gotBanknotes = new int[BANKNOTES.length];
    }

    public void addBanknotes(int quantity) {
        for (int i = 0; i < banknotesQuantity.length; i++) {
            banknotesQuantity[i] += quantity;
        }
        calculateMaxSumCash();
    }

    public boolean possibleGetCash(int cashSum) {
        if (cashSum <= maxSumCash) {
            for (int i = BANKNOTES.length - 1; i >= 0; i--) {
                gotBanknotes[i] = (cashSum - cashSum % BANKNOTES[i].getFaceValue()) / BANKNOTES[i].getFaceValue();
                if (gotBanknotes[i] > banknotesQuantity[i]) {
                    gotBanknotes[i] = banknotesQuantity[i];
                }
                cashSum -= gotBanknotes[i] * BANKNOTES[i].getFaceValue();
            }
            return cashSum == 0;
        } else {
            return false;
        }
    }

    public StringBuilder getCash(int cashSum) {
        StringBuilder offer = new StringBuilder();
        if (this.possibleGetCash(cashSum)) {
            for (int i = 0; i < BANKNOTES.length; i++) {
                offer.append(gotBanknotes[i]).append(" - ").append(BANKNOTES[i].getStringValue()).append("; ");
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
            maxSumCash += BANKNOTES[i].getFaceValue() * banknotesQuantity[i];
        }
    }
}
