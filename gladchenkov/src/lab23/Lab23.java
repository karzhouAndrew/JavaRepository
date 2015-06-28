package lab23;


public class Lab23 {
    private int nominal20;
    private int nominal50;
    private int nominal100;
    private int sum;
    private int money;
    private int cash;

    public Lab23(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    public int getNominal20() {
        System.out.println("Количесвто купюр номиналом 20 = " + nominal20);
        return nominal20;
    }

    public void setNominal20(int nominal20) {
        this.nominal20 = this.nominal20 + nominal20;
    }

    public int getNominal50() {
        System.out.println("Количесвто купюр номиналом 50 = " + nominal50);
        return nominal50;
    }

    public void setNominal50(int nominal50) {
        this.nominal50 = this.nominal50 + nominal50;
    }

    public int getNominal100() {
        System.out.println("Количесвто купюр номиналом 100 = " + nominal100);
        return nominal100;
    }

    public void setNominal100(int nominal100) {
        this.nominal100 = this.nominal100 + nominal100;
    }

    public int calculateBalance() {
        this.sum = nominal20 * 20 + nominal50 * 50 + nominal100 * 100;
        System.out.println("Ваш баланс составляет:" + this.sum);
        getNominal20();
        getNominal50();
        getNominal100();
        return sum;
    }


    public void getCash(int cash) {
        this.cash = cash;
        if (cash > this.sum) {
            System.out.println("Операция не выполнена. Сумма запроса больше баланса на карточке");
        } else {
            System.out.println("Операция возможна.Идет выдача суммы: " + cash);
            while (cash >= 100 && nominal100 >= 1) {
                setNominal100(-1);
                money += 100;
                cash -= 100;
                System.out.println("Выдана купюра номиналом 100");
            }
            while (cash >= 50 && nominal50 >= 1) {
                setNominal50(-1);
                money += 50;
                cash -= 50;
                System.out.println("Выдана купюра номиналом 50");
            }
            while (cash >= 20 && nominal20 >= 1) {
                setNominal20(-1);
                money += 20;
                cash -= 20;
                System.out.println("Выдана купюра номиналом 20");
            }
            if (money == cash) {
                System.out.println("Итого выдано средств:" + money);
            } else {
                System.out.println("Итого выдано средств:" + money + " Нет купюр меньшего номинала для выдачи остатка");
            }

        }


    }
}
