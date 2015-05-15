package lab23;

/**
 * Created by Константин on 15.05.2015.
 */
public class Atm {
    private int denomination20;
    private int denomination50;
    private int denomination100;

    public Atm(int denomination20, int denomination50, int denomination100) {
        this.denomination20 = denomination20;
        this.denomination50 = denomination50;
        this.denomination100 = denomination100;
    }

    public int getDenomination20() {
        return this.denomination20;
    }

    public int getDenomination50() {
        return denomination50;
    }

    public int getDenomination100() {
        return denomination100;
    }

    public void setDenomination20(int denomination20) {
        this.denomination20 = this.denomination20 + denomination20;
    }

    public void setDenomination50(int denomination50) {
        this.denomination50 = this.denomination50 + denomination50;
    }

    public void setDenomination100(int denomination100) {
        this.denomination100 = this.denomination100 + denomination100;
    }

    private int amountMoney(int denomination100, int denomination50, int denomination20) {
        return (denomination100 * 100 + denomination50 * 50 + denomination20 * 20);
    }

    public boolean withdrawMoney(int total) {
        boolean operation = false;
        if (amountMoney(denomination100, denomination50, denomination20) >= total) {
            int amountBills100 = (total - total % 100) / 100;
            int amountBills50 = ((total - amountBills100 * 100) - (total - amountBills100 * 100) % 50) / 50;
            int amountBills20 = ((total - (amountBills100 * 100 + amountBills50 * 50)) - (total - (amountBills100 * 100
                    + amountBills50 * 50)) % 20) / 20;
            if (amountBills100 * 100 + amountBills50 * 50 + amountBills20 * 20 == total) {
                if ((denomination100 >= amountBills100) && (denomination50 >= amountBills50) &&
                        (denomination20 >= amountBills20)) {
                    denomination100 = denomination100 - amountBills100;
                    denomination50 = denomination50 - amountBills50;
                    denomination20 = denomination20 - amountBills20;
                    operation = true;
                    System.out.println("Операция произошла успешно =  " + operation);
                    System.out.println("Сумма выдается количеством купюр 100 дол. = " + amountBills100 +
                            " количеством купюр 50 дол. = " + amountBills50 +
                            " количеством купюр 20 дол. = " + amountBills20);
                }
            } else {
                System.out.println("Недостаточно купюр =  " + operation);
                operation = false;
            }
        } else {
            System.out.println("Недостаточно средств =  " + operation);
        }
        return operation;
    }
}


