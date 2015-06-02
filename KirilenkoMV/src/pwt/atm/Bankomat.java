package pwt.atm;

/**
 * Created by asus on 16.05.2015.
 */
public class Bankomat {
    public final int MAX_COUNTER = 1000;
    private int counter20;
    private int counter50;
    private int counter100;

    public Bankomat(int counter20, int counter50, int counter100) {
        setCounter20(counter20);
        setCounter50(counter50);
        setCounter100(counter100);
    }

    public void addMoney() {
        setCounter20(MAX_COUNTER);
        setCounter50(MAX_COUNTER);
        setCounter100(MAX_COUNTER);
    }

    public boolean dispenseMoney(int sumForDispense) {
        int nominal100 = 0;
        int nominal50 = 0;
        int nominal20 = 0;
        if (sumForDispense % 10 != 0 || sumForDispense == 10 || sumForDispense == 30) {
            return false;
        }
        if (sumForDispense % 20 == 0) {
            nominal100 = sumForDispense / 100;
            nominal20 = (sumForDispense - nominal100 * 100) / 20;
            if (nominal100 > getCounter100()) {
                nominal50 = (nominal100 - getCounter100()) * 2;
                nominal100 = getCounter100();
                if (nominal50 > getCounter50()) {
                    nominal20 += (nominal50 - getCounter50()) / 2 * 5;
                    nominal50 = getCounter50();
                    if (nominal20 > getCounter20()) {
                        System.out.println("Могу выдать, но не хватает купюр.");
                        return false;
                    }
                }
            }
            System.out.println("Выдаем " + nominal100 + "x100;" + nominal50 + "х50;" + nominal20 + "х20");
            return true;
        } else if (sumForDispense % 20 != 0) {
            sumForDispense = sumForDispense - 50;
            nominal50++;
            nominal100 = sumForDispense / 100;
            nominal20 = (sumForDispense - nominal100 * 100) / 20;
            if (nominal100 > getCounter100()) {
                nominal50 = (nominal100 - getCounter100()) * 2;
                nominal100 = getCounter100();
                if (nominal50 > getCounter50()) {
                    nominal20 += (nominal50 - getCounter50()) / 2 * 5;
                    nominal50 = getCounter50();
                    if (nominal20 > getCounter20()) {
                        System.out.println("Могу выдать, но не хватает купюр.");
                        return false;
                    }
                }
            }
            System.out.println("Выдаем " + nominal100 + "x100;" + nominal50 + "х50;" + nominal20 + "х20");
            return true;
        }

        return false;
    }


    public int getCounter20() {
        return counter20;
    }

    public void setCounter20(int counter20) {
        this.counter20 = counter20;
    }

    public int getCounter50() {
        return counter50;
    }

    public void setCounter50(int counter50) {
        this.counter50 = counter50;
    }

    public int getCounter100() {
        return counter100;
    }

    public void setCounter100(int counter100) {
        this.counter100 = counter100;
    }
}
