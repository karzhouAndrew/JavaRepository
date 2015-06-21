package task23;

//Создать класс и объекты описывающие Банкомат.
//Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
//Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги. На вход передается сумма денег.
//На выход – булевское значение (операция удалась или нет).
//При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
//Создать конструктор с тремя параметрами – количеством купюр.

public class TaskTest {
    public static void main(String[] args) {
        CashDispenser cashDispenser = new CashDispenser(10, 10, 10);
        int cashSum = 1570;
        System.out.println("Max cash sum in cash dispenser: " + cashDispenser.getMaxSumCash());
        System.out.println("It is possible to get cash " + cashSum + " : " + cashDispenser.possibleGetCash(cashSum));
        System.out.println("Got banknotes: " + cashDispenser.getCash(cashSum));
        cashDispenser.addBanknotes(1);
        System.out.println("Banknotes added.");
        System.out.println("Max cash sum in cash dispenser: " + cashDispenser.getMaxSumCash());
        System.out.println("It is possible to get cash " + cashSum + " : " + cashDispenser.possibleGetCash(cashSum));
        System.out.println("Got banknotes: " + cashDispenser.getCash(cashSum));
        System.out.println("Max cash sum in cash dispenser: " + cashDispenser.getMaxSumCash());
    }
}
