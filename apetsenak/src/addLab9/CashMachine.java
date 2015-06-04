package addLab9;


public class CashMachine {
    public CashMachine() {
    }

    @Transaction(version = "ver. 1.0.0")
    public void transaction() {
        System.out.println("Transaction is processing...");
    }
}
