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
        Money money20 = new Money();
        Money money50 = new Money();
        Money money100 = new Money();
        CashMachine cashMachine = new CashMachine(0, 0, 0);
        System.out.println(cashMachine.getMoney(830));
        System.out.println("20 : " + CashMachine.count20() + "\n" +
                "50 : " + CashMachine.count50() + "\n" +
                "100 : " + CashMachine.count100());
/*      System.out.println(cashMachine.toString());
        cashMachine.increaseNumBanknotes(5, 6, 1);
        System.out.println(cashMachine.toString());
        System.out.println(MonetaryValue.VALUE100.getValue());
        System.out.println(Arrays.toString(MonetaryValue.values()));*/
    }
}
