package lab23;

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
        return denomination20;
    }

    public int getDenomination50() {
        return denomination50;
    }

    public int getDenomination100() {
        return denomination100;
    }

    public void enterDenomination20(int denomination20) {
        this.denomination20 += denomination20;
    }

    public void enterDenomination50(int denomination50) {
        this.denomination50 += denomination50;
    }

    public void enterDenomination100(int denomination100) {
        this.denomination100 += denomination100;
    }

    private int amountMoney(int denomination100, int denomination50, int denomination20) {
        return (denomination100 * 100 + denomination50 * 50 + denomination20 * 20);
    }

    private int amountBills100(int total) {
        return (total - total % 100) / 100;
    }

    private int amountBills50(int total) {
        return ((total - amountBills100(total) * 100) - (total - amountBills100(total) * 100) % 50) / 50;
    }

    private int amountBills20(int total) {
        return ((total - (amountBills100(total) * 100 + amountBills50(total) * 50)) - (total - (amountBills100(total) * 100
                + amountBills50(total) * 50)) % 20) / 20;
    }

    public boolean withdrawMoney(int total) {
        boolean operation = false;
        if (amountMoney(denomination100, denomination50, denomination20) >= total) {
            if (amountBills100(total) * 100 + amountBills50(total) * 50 + amountBills20(total) * 20 == total) {
                if ((denomination100 >= amountBills100(total)) && (denomination50 >= amountBills50(total)) &&
                        (denomination20 >= amountBills20(total))) {
                    denomination100 -= amountBills100(total);
                    denomination50 -= amountBills50(total);
                    denomination20 -= amountBills20(total);
                    operation = true;
                    System.out.println("Операция произошла успешно =  " + operation);
                    System.out.println("Сумма выдается количеством купюр 100 дол. = " + amountBills100(total) +
                            " количеством купюр 50 дол. = " + amountBills50(total) +
                            " количеством купюр 20 дол. = " + amountBills20(total));
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


