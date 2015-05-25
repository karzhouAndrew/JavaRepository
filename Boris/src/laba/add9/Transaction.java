package laba.add9;


public class Transaction {
    @TransactionAnnotation()
    public void startTransaction (int quantity){
        for (int i = 0; i < quantity; i++) {

        }
        System.out.println("Doing.");
    }

}
