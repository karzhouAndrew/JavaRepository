package lab23;

/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться
тремя свойствами: количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское значение
(операция удалась или нет). При снятии денег функция должна рапечатывать каким количеством купюр какого
номинала выдается сумма. Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.
 */
public class Main {
    public static void main(String[] args) {
        CashMachine setMoney = new CashMachine();
        CashMachine empty = new CashMachine();
        setMoney.setTheMoneyInMachine(100, 100, 100);
        CashMachine getMoney = new CashMachine(16300);
        String resultOfOperation = empty.getMoneyFromMachine(getMoney);
        System.out.println(CashMachine.amountOfMoneyInCashMachine);
        System.out.println(resultOfOperation);
    }
}
