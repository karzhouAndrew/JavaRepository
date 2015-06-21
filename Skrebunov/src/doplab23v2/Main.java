package doplab23v2;

/*Банкомат
 */
public class Main {
    public static void main(String[] args) {
        CashMachine operation = new CashMachine();
        CashMachine cashMachine = new CashMachine();
        operation.setTheMoneyInMachine(100, 100, 100);
        CashMachine transaction = new CashMachine(16370);
        String operationResult = cashMachine.getMoneyFromMachine(transaction);
        System.out.println(CashMachine.totalAmountInMachine);
        System.out.println(operationResult);
    }
}
