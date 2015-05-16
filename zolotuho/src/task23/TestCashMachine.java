package task23;


public class TestCashMachine {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10, 10, 10);
        cashMachine.obtainCash(1100);
        System.out.println(cashMachine.toString());
        cashMachine.addDenominations(100, 300, 500);
        System.out.println(cashMachine.toString());
        cashMachine.obtainCash(5000);
        System.out.println(cashMachine.toString());

    }
}
