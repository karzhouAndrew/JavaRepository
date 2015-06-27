package task43;

import java.util.concurrent.atomic.AtomicInteger;

public class Products {
    private AtomicInteger breadQuantity = new AtomicInteger();
    private AtomicInteger butterQuantity = new AtomicInteger();
    private AtomicInteger sausagesQuantity = new AtomicInteger();

    public Products(int breadQuantity, int butterQuantity, int sausagesQuantity) {
        this.breadQuantity.set(breadQuantity);
        this.butterQuantity.set(butterQuantity);
        this.sausagesQuantity.set(sausagesQuantity);
    }

    public Products() {
    }

    public void addProducts(Products products) {
        breadQuantity.addAndGet(products.breadQuantity.get());
        butterQuantity.addAndGet(products.butterQuantity.get());
        sausagesQuantity.addAndGet(products.sausagesQuantity.get());
    }

    public void subtractProducts(Products products) {
        breadQuantity.addAndGet(-products.breadQuantity.get());
        butterQuantity.addAndGet(-products.butterQuantity.get());
        sausagesQuantity.addAndGet(-products.sausagesQuantity.get());
    }

    public AtomicInteger getBreadQuantity() {
        return breadQuantity;
    }

    public void setBreadQuantity(AtomicInteger breadQuantity) {
        this.breadQuantity = breadQuantity;
    }

    public AtomicInteger getButterQuantity() {
        return butterQuantity;
    }

    public void setButterQuantity(AtomicInteger butterQuantity) {
        this.butterQuantity = butterQuantity;
    }

    public AtomicInteger getSausagesQuantity() {
        return sausagesQuantity;
    }

    public void setSausagesQuantity(AtomicInteger sausagesQuantity) {
        this.sausagesQuantity = sausagesQuantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "breadQuantity=" + breadQuantity +
                ", butterQuantity=" + butterQuantity +
                ", sausagesQuantity=" + sausagesQuantity +
                '}';
    }
}
