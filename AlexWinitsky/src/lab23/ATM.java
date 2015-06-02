package lab23;

/**
 * Created by Master on 15.05.2015.
 */
public class ATM {
    private int banknote20;
    private int banknote50;
    private int banknote100;


    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addMoney(int banknote20, int banknote50, int banknote100) {
        System.out.println("Сумма денег в банкомате перед пополением " + moneyInATM());
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
        System.out.println("Сумма денег в банкомате после пополнения " + moneyInATM());
    }

    private boolean checkOrder(int money) {
        boolean transaction = true;
        int sum = moneyInATM();
        if (money % 10 != 0) {
            transaction = false;
            System.out.println("Нет купюр кратных данной сумме");
        }
        if (money > sum) {
            transaction = false;
            System.out.println("В банкомате не достаточно стредств");
        }
        return transaction;
    }

    private int moneyInATM() {
        return 20 * banknote20 + 50 * banknote50 + 100 * banknote100;
    }

    public boolean getMoney(int money) {
        boolean transaction = checkOrder(money);
        int temp = 0;
        if (transaction) {
            if (money % 100 != 0 && money != 10 && money != 30) {
                temp = money - (100 * (money / 100));
                if (temp != 10 && temp != 30) {
                    System.out.println("Количество купюр по 100 = " + money / 100);
                } else {
                    temp += 100;
                    System.out.println("Количество купюр по 100 = " + (money / 100 - 1));
                }
                if (temp % 50 != 0) {
                    if ((money - 50 * (money / 50)) != 10 && (money - 50 * (money / 50)) != 30) {
                        System.out.println("Количество купюр по 50 = " + temp / 50);
                        temp = money - 50 * (money / 50);
                        System.out.println("Количество купюр по 20 = " + division20(temp));
                    } else {
                        System.out.println("Количество купюр по 50 = " + (temp / 50 - 1));
                        temp = money - 50 * (money / 50) + 50;
                        System.out.println("Количество купюр по 20 = " + division20(temp));
                    }
                } else {
                    System.out.println("Количество купюр по 50 = " + temp / 50);
                    System.out.println("Количество купюр по 20 = " + 0);
                }
            } else {
                if (money % 100 == 0 && money != 10 && money != 30) {
                    System.out.println("Количество купюр по 100 = " + money / 100);
                }
            }
        }
        return transaction;
    }


    private int division20(int number) {
        int result = (number % 20 == 0) ? number / 20 : 0;
        return result;
    }


}
