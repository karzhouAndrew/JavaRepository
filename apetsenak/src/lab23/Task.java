package lab23;

/**
 * Создать класс и объекты описывающие Банкомат.
 * Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию снимающую деньги. На вход передается сумма денег.
 * На выход – булевское значение (операция удалась или нет).
 * При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.
 */
public class Task {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(3, 5, 2);
        System.out.println(cashMachine);
        cashMachine.withdrawMoney(580);
        System.out.println("Пополняем кол-во купюр в банкомате.");
        cashMachine.addBills(0, 10, 0);
        System.out.println(cashMachine);
        cashMachine.withdrawMoney(580);
        System.out.println("Пополняем кол-во купюр в банкомате.");
        cashMachine.addBills(6, 0, 0);
        cashMachine.withdrawMoney(580);
    }
}
