package doplab23v2;

/*Банкомат
 */
public class Main {
    public static void main(String[] args) {
        CashMachine setMoney = new CashMachine();
        CashMachine empty = new CashMachine();
        setMoney.setTheMoneyInMachine(100, 100, 100);
        CashMachine getMoney = new CashMachine(16370);
        String operationResult = empty.getMoneyFromMachine(getMoney);
        System.out.println(CashMachine.totalamountInMachine);
        System.out.println(operationResult);
    }
}
