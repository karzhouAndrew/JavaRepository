package laba23;

//Создать класс и объекты опивывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
//кол-вом купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающие деньги.
//На вход передается сумма денег. На выход - булевское занчение (операция удалась или не удалась). При снятии денег
//функция должна расспечатывать каким кол-вом купюр какого номинала выдается сумма. Создать конструктор с
// тремя параметрами - кол-вом купюр. Прочее - на ваше усмотрение.


public class CashMachine {

    private int quantity20;
    private int quantity50;
    private int quantity100;
    private final int NOMINAL_20 = 20;
    private final int NOMINAL_50 = 50;
    private final int NOMINAL_100 = 100;

    public CashMachine(int quantity20, int quantity50, int quantity100) {
        addQuantity(quantity20, quantity50, quantity100);
    }

    private void addQuantity(int quantity20, int quantity50, int quantity100) {
        if (quantity20 > 0 && quantity50 > 0 && quantity100 > 0) {
            this.quantity20 += quantity20;
            this.quantity50 += quantity50;
            this.quantity100 += quantity100;
        } else {
            System.out.println("Ошибка ввода кол-ва купюр.");
        }
    }

    public boolean possibilityTakeOffCash(int quantityMoney) {
        CashMachine cloneFieldsCashMachine = new CashMachine(quantity20, quantity50, quantity100);
        if (isCorrectMoneyAmount(quantityMoney, cloneFieldsCashMachine)) {
            writtenOffMoney(quantityMoney);
            System.out.println("Деньги списаны в кол-ве " + quantityMoney + ". "
                    + (cloneFieldsCashMachine.quantity100 - this.quantity100)
                    + " купюр номиналом 100, " + (cloneFieldsCashMachine.quantity50 - this.quantity50)
                    + " купюр номиналом 50, " + (cloneFieldsCashMachine.quantity20 - this.quantity20)
                    + " купюр номиналом 20 " + " и выданы.");
            return true;
        } else {
            return false;
        }
    }

    private boolean isCorrectMoneyAmount(int quantityMoney, CashMachine cloneFieldsCashMachine) {
        if (quantityMoney > 0) {
            return isThisEnoughMoney(quantityMoney, cloneFieldsCashMachine);
        } else {
            System.out.println("Введено некорректное значение снимаемой суммы.");
            return false;
        }
    }

    private boolean isThisEnoughMoney(int quantityMoney, CashMachine cloneFieldsCashMachine) {
        if (quantityMoney <= quantity100 * NOMINAL_100 + quantity50 * NOMINAL_50 + quantity20 * NOMINAL_20) {
            return isEnoughQuantityBankNotes(quantityMoney, cloneFieldsCashMachine);
        } else {
            System.out.println("В банкомате нет столько денег.");
            return false;
        }
    }

    private boolean isEnoughQuantityBankNotes(int quantityMoney, CashMachine cloneFieldsCashMachine) {
        if (isEnoughPaperMoney(quantityMoney)) {
            return true;
        } else {
            System.out.println("В банкомате не хватает купюр с определенным номиналом.");
            return false;
        }
    }

    private void writtenOffMoney(int quantity20, int quantity50, int quantityMoney) {
        this.quantity20 -= quantity20;
        this.quantity50 -= quantity50;
        quantityMoney -= (quantity20 * NOMINAL_20 + quantity50 * NOMINAL_50);
        //This or another logic written off money;
        while (this.quantity100 * quantityMoney != 0) {
            this.quantity100--;
            quantityMoney -= 100;
        }
        while (this.quantity50 * quantityMoney != 0) {
            this.quantity50 -= 2;
            quantityMoney -= 100;
        }
        while (this.quantity20 * quantityMoney != 0) {
            this.quantity20 -= 5;
            quantityMoney -= 100;
        }

    }

    private void writtenOffMoney(int money) {
        if (money % 20 == 0) {
            writtenOffMoney((money % NOMINAL_100) / NOMINAL_20, 0, money);
        } else {
            writtenOffMoney((money - NOMINAL_50) % NOMINAL_100 / NOMINAL_20, 1, money);
        }
    }

    private boolean isEnoughPaperMoney(int quantityMoney) {
        if (quantityMoney % NOMINAL_20 == 0) {
            return isEnough20BankNotes(quantityMoney);
        } else if ((quantityMoney - NOMINAL_50) % 20 == 0) {
            return isEnough20And50BankNotes(quantityMoney);
        } else {
            return false;
        }
    }

    private boolean isEnough20And50BankNotes(int quantityMoney) {
        if (quantity50 >= 1 && quantity20 >= ((quantityMoney - NOMINAL_50) % NOMINAL_100) / NOMINAL_20) {
            return true;
        }
        return false;
    }

    private boolean isEnough20BankNotes(int quantityMoney) {
        if (quantity20 >= (quantityMoney % NOMINAL_100) / NOMINAL_20) {
            return true;
        } else {
            return false;
        }
    }

    public void reloadCashMachine(int quantity20, int quantity50, int quantity100) {
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
        this.quantity100 = quantity100;
    }

    public void addQuantity20(int quantity20) {
        addQuantity(quantity20, 0, 0);
    }

    public void addQuantity50(int quantity50) {
        addQuantity(0, quantity50, 0);
    }

    public void addQuantity100(int quantity100) {
        addQuantity(0, 0, quantity100);
    }

    public void cashRemainder() {
        System.out.println("Осталось " + (quantity20 * NOMINAL_20 + quantity50 * NOMINAL_50 + quantity100 * NOMINAL_100)
                + " денег в банкомате.");
    }
}
