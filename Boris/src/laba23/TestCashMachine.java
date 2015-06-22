package laba23;

//Проверка класса CashMachine
public class TestCashMachine {
    public static void main(String[] args) {
        CashMachine atm = new CashMachine(20, 30, 50);
        atm.reloadCashMachine(5, 5, 30);
        System.out.println(atm.possibilityTakeOffCash(5000));
        System.out.println(atm.possibilityTakeOffCash(3070));
        atm.cashRemainder();

    }
}
