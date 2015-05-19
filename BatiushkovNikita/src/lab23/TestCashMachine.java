package lab23;

// Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию снимающую деньги. На вход передается сумма денег.
// На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.

public class TestCashMachine {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(0, 0, 0);
        cashMachine.addMoney(10, 10, 10);
        cashMachine.getMoney(390);
    }
}
