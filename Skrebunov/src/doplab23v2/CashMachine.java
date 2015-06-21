package doplab23v2;


public class CashMachine {
    private int ratingTwenty;
    private int ratingFifty;
    private int ratingOneHundred;
    private int moneySum;
    public static int totalamountInMachine = 0;

    public CashMachine() {

    }

    public CashMachine(int moneySum) {
        this.moneySum = moneySum;
    }

    public CashMachine(int ratingTwenty, int ratingFifty, int ratingOneHundred) {
        this.ratingTwenty = ratingTwenty;
        this.ratingFifty = ratingFifty;
        this.ratingOneHundred = ratingOneHundred;
    }

    public int getRatingTwenty() {
        return ratingTwenty;
    }

    public void setRatingTwenty(int ratingTwenty) {
        this.ratingTwenty = ratingTwenty;
    }

    public int getRatingFifty() {
        return ratingFifty;
    }

    public void setRatingFifty(int ratingFifty) {
        this.ratingFifty = ratingFifty;
    }

    public int getRatingOneHundred() {
        return ratingOneHundred;
    }

    public void setRatingOneHundred(int ratingOneHundred) {
        this.ratingOneHundred = ratingOneHundred;
    }

    public void setTheMoneyInMachine(int oneHundred, int fifty, int twenty) {
        totalamountInMachine = oneHundred * 100 + fifty * 50 + twenty * 20;
    }

    public String getMoneyPartOne(int inputSum) {
        String resultFromOne = null;
        if (inputSum < 100 && inputSum % 50 == 0) {
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 50 = " + inputSum / 50;
        } else if (inputSum < 100 && inputSum > 60 && inputSum != 80) {
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 50 = 1, " +
                    " количество купюр номиналом 20 = " + (inputSum - 50) / 20;
        } else if (inputSum % 50 == 0) {
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 100 = " + inputSum / 100 +
                    ", количество купюр номиналом 50 = " + (inputSum - (inputSum / 100) * 100) / 50;
        }
        return resultFromOne;
    }

    public String getMoneyPartTwo(int inputSum) {
        String resultFromTwo = null;
        if (inputSum < 100 && inputSum % 20 == 0) {
            resultFromTwo = "Операция произошла успешно, количество купюр номиналом 20 = " + inputSum / 20;
        } else if (inputSum % 100 == 20 || inputSum % 100 == 40 || inputSum % 100 == 60 || inputSum % 100 == 80) {
            resultFromTwo = "Операция произошла успешно, количество купюр номиналом 100 = " + inputSum / 100 +
                    ", количество купюр номиналом 20 = " + (inputSum - inputSum / 100 * 100) / 20;
        }
        return resultFromTwo;
    }

    public String getMoneyPartThree(int inputSum) {
        String resultFromThree = null;
        if (inputSum % 100 == 70 || inputSum % 100 == 90) {
            resultFromThree = getMoneyPartFour(inputSum);
        } else if (inputSum % 100 == 10 || inputSum % 100 == 30) {
            resultFromThree = getMoneyPartFive(inputSum);
        }
        return resultFromThree;
    }

    private String getMoneyPartFour(int inputSum) {
        int fiftyBills = (inputSum - inputSum / 100 * 100) / 50;
        int twentyBills = ((inputSum - inputSum / 100 * 100) - (fiftyBills * 50)) / 20;
        return "Операция произошла успешно, количество купюр номиналом 100 = " + inputSum / 100 +
                ", количество купюр номиналом 50 = " + fiftyBills + ", количество купюр номиналом 20 = " + twentyBills;
    }

    private String getMoneyPartFive(int inputSum) {
        int hundredBills = (inputSum / 100) - 1;
        int intermediate = (inputSum - hundredBills * 100);
        int twentyBills = (intermediate - 50) / 20;
        return "Операция произошла успешно, количество купюр номиналом 100 = " + hundredBills +
                ", количество купюр номиналом 50 = 1, количество купюр номиналом 20 = " + twentyBills;
    }

    public String getMoneyFromMachine(CashMachine getMoney) {
        int inputSum = getMoney.moneySum;
        String result = null;
        if (totalamountInMachine < inputSum) {
            result = "Недостаточно средств";
        } else if (inputSum % 10 != 0 || inputSum == 10 || inputSum == 30) {
            result = "Сумма введена не верно";
        } else if (inputSum % 100 == 0) {
            result = "Операция произошла успешно, количество купюр номиналом 100 = " + inputSum / 100;
        } else if ((inputSum < 100 && inputSum % 50 == 0) || (inputSum < 100 && inputSum > 60 && inputSum != 80)
                || (inputSum % 50 == 0)) {
            result = getMoney.getMoneyPartOne(inputSum);
        } else if ((inputSum < 100 && inputSum % 20 == 0) || (inputSum % 100 == 20 || inputSum % 100 == 40 ||
                inputSum % 100 == 60 || inputSum % 100 == 80)) {
            result = getMoney.getMoneyPartTwo(inputSum);
        } else if ((inputSum % 100 == 70 || inputSum % 100 == 90) || (inputSum % 100 == 10 || inputSum % 100 == 30)) {
            result = getMoney.getMoneyPartThree(inputSum);
        }
        return result;
    }
}
