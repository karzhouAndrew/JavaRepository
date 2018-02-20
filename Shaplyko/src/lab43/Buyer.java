package lab43;

public class Buyer extends Thread {
    private static int nextBuyer = 1;
    private int thisBuyer;

    public Buyer() {
        this.thisBuyer = nextBuyer++;
        start();
    }

    public int getIdBuyer() {
        return thisBuyer;
    }

    @Override
    public void run() {
        CreationProduct creationProduct = new CreationProduct();
        creationProduct.shoppingCart();
        System.out.println("Номер покупателя: " + getIdBuyer());
        System.out.println("Продукты покупателя " + getIdBuyer() + " " + creationProduct.toString());
        System.out.println("Покупателя " + getIdBuyer() + " Сумма чека : " + creationProduct.ticketWindow());
    }
}
