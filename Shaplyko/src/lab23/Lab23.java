package lab23;

/**
 * Задание 23
 Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя
 свойствами: количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать
 функцию снимающую деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась
 или нет). При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
 Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.

 */
public class Lab23 {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 0);
        atm.setDenomination100(2);
        atm.setDenomination50(1);
        atm.setDenomination20(1);
        atm.getDenomination100();
        atm.withdrawMoney(220);
    }
}


