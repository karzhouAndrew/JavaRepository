package module2.laba10;


import module2.laba10.customer.Customer;

public class TestThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Customer customer = new Customer();
            customer.generateProducts((int) (Math.random() * 5));
            CashDeskThread.getInstance().work(customer);
        }
    }
}
