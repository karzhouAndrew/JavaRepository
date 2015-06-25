package module2.laba10;


import module2.laba10.customer.Customer;

public class TestThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            Customer customer = new Customer();
            CashDeskThread.getInstance().work(customer);
        }
        CashDeskThread.getInstance().shutdown();
    }
}
