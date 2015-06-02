package lab23;


public class CashMachine {
    private int ratingTwenty;
    private int ratingFifty;
    private int ratingOneHundred;
    private int sumOfMoney;
    public static int amountOfMoneyInCashMachine = 0;

    public CashMachine() {

    }

    public CashMachine(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
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
        amountOfMoneyInCashMachine = oneHundred * 100 + fifty * 50 + twenty * 20;
    }

    public String getMoneyPartOne(int sumOfMoney) {
        String resultFromOne = null;
        if (sumOfMoney < 100 && sumOfMoney % 50 == 0) {
            int numberOfFiftyBills = sumOfMoney / 50;
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 50 = " + numberOfFiftyBills;
        } else if (sumOfMoney < 100 && sumOfMoney > 60 && sumOfMoney != 80) {
            int numberOfTwentyBills = (sumOfMoney - 50) / 20;
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 50 = 1, " +
                    " количество купюр номиналом 20 = " + numberOfTwentyBills;
        } else if (sumOfMoney % 50 == 0) {
            int numberOfHundredBills = sumOfMoney / 100;
            int numberOfFiftyBills = (sumOfMoney - numberOfHundredBills * 100) / 50;
            resultFromOne = "Операция произошла успешно, количество купюр номиналом 100 = " + numberOfHundredBills +
                    ", количество купюр номиналом 50 = " + numberOfFiftyBills;
        }
        return resultFromOne;
    }

    public String getMoneyPartTwo(int sumOfMoney) {
        String resultFromTwo = null;
        if (sumOfMoney < 100 && sumOfMoney % 20 == 0) {
            int numberOfTwentyBills = sumOfMoney / 20;
            resultFromTwo = "Операция произошла успешно, количество купюр номиналом 20 = " + numberOfTwentyBills;
        } else if (sumOfMoney % 100 == 20 || sumOfMoney % 100 == 40 || sumOfMoney % 100 == 60 || sumOfMoney % 100 == 80) {
            int numberOfHundredBills = sumOfMoney / 100;
            int numberOfTwenyBills = (sumOfMoney - numberOfHundredBills * 100) / 20;
            resultFromTwo = "Операция произошла успешно, количество купюр номиналом 100 = " + numberOfHundredBills +
                    ", количество купюр номиналом 20 = " + numberOfTwenyBills;
        }
        return resultFromTwo;
    }

    public String getMoneyPartThree(int sumOfMoney) {
        String resultFromThree = null;
        if (sumOfMoney % 100 == 70 || sumOfMoney % 100 == 90) {
            int numberOfHundredBills = sumOfMoney / 100;
            int numberOfFiftyBills = (sumOfMoney - numberOfHundredBills * 100) / 50;
            int numberOfTwentyBills = ((sumOfMoney - numberOfHundredBills * 100) - (numberOfFiftyBills * 50)) / 20;
            resultFromThree = "Операция произошла успешно, количество купюр номиналом 100 = " + numberOfHundredBills +
                    ", количество купюр номиналом 50 = " + numberOfFiftyBills + ", количество купюр номиналом 20 = " + numberOfTwentyBills;
        } else if (sumOfMoney % 100 == 10 || sumOfMoney % 100 == 30) {
            int numberOfHundredBills = (sumOfMoney / 100) - 1;
            int intermediate = (sumOfMoney - numberOfHundredBills * 100);
            int numberOfTwentyBills = (intermediate - 50) / 20;
            resultFromThree = "Операция произошла успешно, количество купюр номиналом 100 = " + numberOfHundredBills +
                    ", количество купюр номиналом 50 = 1, количество купюр номиналом 20 = " + numberOfTwentyBills;
        }
        return resultFromThree;
    }

    public String getMoneyFromMachine(CashMachine numberOfMoneyFromObject) {
        int numberOfMoney = numberOfMoneyFromObject.sumOfMoney;
        String result = null;
        if (amountOfMoneyInCashMachine < numberOfMoney) {
            result = "Недостаточно средств";
        } else if (numberOfMoney % 10 != 0 || numberOfMoney == 10 || numberOfMoney == 30) {
            result = "Сумма введена не верно";
        } else if (numberOfMoney % 100 == 0) {
            int numberOfHundredBills = numberOfMoney / 100;
            result = "Операция произошла успешно, количество купюр номиналом 100 = " + numberOfHundredBills;
        } else if ((numberOfMoney < 100 && numberOfMoney % 50 == 0) || (numberOfMoney < 100 && numberOfMoney > 60 && numberOfMoney != 80)
                || (numberOfMoney % 50 == 0)) {
            result = numberOfMoneyFromObject.getMoneyPartOne(numberOfMoney);
        } else if ((numberOfMoney < 100 && numberOfMoney % 20 == 0) || (numberOfMoney % 100 == 20 || numberOfMoney % 100 == 40 ||
                numberOfMoney % 100 == 60 || numberOfMoney % 100 == 80)) {
            result = numberOfMoneyFromObject.getMoneyPartTwo(numberOfMoney);
        } else if ((numberOfMoney % 100 == 70 || numberOfMoney % 100 == 90) || (numberOfMoney % 100 == 10 || numberOfMoney % 100 == 30)) {
            result = numberOfMoneyFromObject.getMoneyPartThree(numberOfMoney);
        }
        return result;
    }
}
