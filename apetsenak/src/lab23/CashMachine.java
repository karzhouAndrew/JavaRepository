package lab23;


public class CashMachine {
    private int twentyBills;
    private int fiftyBills;
    private int hundredBills;

    public CashMachine(int twentyBills, int fiftyBills, int hundredBills) {
        this.twentyBills = twentyBills;
        this.fiftyBills = fiftyBills;
        this.hundredBills = hundredBills;
    }

    public void addBills(int twentyBills, int fiftyBills, int hundredBills) {
        this.twentyBills += twentyBills;
        this.fiftyBills += fiftyBills;
        this.hundredBills += hundredBills;
    }

    public void pullOutBills(Transaction trans) {
        twentyBills -= trans.getTwentyBillsNum();
        fiftyBills -= trans.getFiftyBillsNum();
        hundredBills -= trans.getHundredBillsNum();
    }

    public int totalAmount() {
        return twentyBills * 20 + fiftyBills * 50 + hundredBills * 100;
    }

    public boolean checkRequestSum(int amount) {
        return amount % 10 == 0 && amount != 10 && amount != 30;
    }

    public boolean editTransaction(Transaction trans) {
        int difference;
        if (trans.getHundredBillsNum() > hundredBills) {
            difference = trans.getHundredBillsNum() - hundredBills;
            trans.setHundredBillsNum(trans.getHundredBillsNum() - difference);
            trans.setFiftyBillsNum(trans.getFiftyBillsNum() + difference * 2);
        }
        if (trans.getFiftyBillsNum() > fiftyBills) {
            difference = trans.getFiftyBillsNum() - fiftyBills;
            if (difference % 2 != 0) {
                difference++;
            }
            trans.setFiftyBillsNum(trans.getFiftyBillsNum() - difference);
            trans.setTwentyBillsNum(trans.getTwentyBillsNum() + difference * 5 / 2);
        }
        return trans.getTwentyBillsNum() <= twentyBills;
    }

    public boolean withdrawMoney(int amount) {
        System.out.println("Запрошенная сумма - " + amount);
        if (amount > totalAmount()) {
            System.out.println("Запрошенная сумма превышает имеющуюся в банкомате.");
            return false;
        }
        if (checkRequestSum(amount)) {
            Transaction trans = new Transaction();
            trans.devideAmount(amount);
            if (editTransaction(trans)) {
                pullOutBills(trans);
                System.out.println(trans);
                return true;
            }
        }
        System.out.println("Сумма не кратна купюрам имеющимся в банкомате.");
        return false;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "twentyBills=" + twentyBills +
                ", fiftyBills=" + fiftyBills +
                ", hundredBills=" + hundredBills +
                '}';
    }
}
