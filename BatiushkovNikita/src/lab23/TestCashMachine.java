package lab23;

// Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию снимающую деньги. На вход передается сумма денег.
// На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.

import java.util.Dictionary;
import java.util.Enumeration;

public class TestCashMachine {

    public static void main(String[] args) {
        Money money20 = new Money();
        Money money50 = new Money();
        Money money100 = new Money();
        CashMachine cashMachine = new CashMachine(10, 10, 10);
        System.out.println(cashMachine.getMoney(170));

        Dictionary dictionary = new Dictionary() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration keys() {
                return null;
            }

            @Override
            public Enumeration elements() {
                return null;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }
        };


        dictionary.put(20, 10);
        dictionary.put(50, 10);
        dictionary.put(100, 10);

        System.out.println(dictionary.elements());




/*        System.out.println("20 : " + CashMachine.count20() + "\n" +
                "50 : " + CashMachine.count50() + "\n" +
                "100 : " + CashMachine.count100());*/
/*      System.out.println(cashMachine.toString());
        cashMachine.increaseNumBanknotes(5, 6, 1);
        System.out.println(cashMachine.toString());
        System.out.println(MonetaryValue.VALUE100.getValue());
        System.out.println(Arrays.toString(MonetaryValue.values()));*/
    }
}
