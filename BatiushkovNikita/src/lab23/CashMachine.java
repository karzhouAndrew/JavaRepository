package lab23;

// Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию снимающую деньги. На вход передается сумма денег.
// На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.

public class CashMachine {
    private int numBanknotes20;
    private int numBanknotes50;
    private int numBanknotes100;

    public CashMachine(int numBanknotes20, int numBanknotes50, int numBanknotes100) {
        this.numBanknotes20 = numBanknotes20;
        this.numBanknotes50 = numBanknotes50;
        this.numBanknotes100 = numBanknotes100;
    }

    public int getNumBanknotes20() {
        return numBanknotes20;
    }

    public void setNumBanknotes20(int numBanknotes20) {
        this.numBanknotes20 = numBanknotes20;
    }

    public int getNumBanknotes50() {
        return numBanknotes50;
    }

    public void setNumBanknotes50(int numBanknotes50) {
        this.numBanknotes50 = numBanknotes50;
    }

    public int getNumBanknotes100() {
        return numBanknotes100;
    }

    public void setNumBanknotes100(int numBanknotes100) {
        this.numBanknotes100 = numBanknotes100;
    }

}
