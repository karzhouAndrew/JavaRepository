package task43;

import java.util.concurrent.atomic.AtomicInteger;

public class ProductsMonitor {
    private AtomicInteger breadQuantity = new AtomicInteger();
    private AtomicInteger butterQuantity = new AtomicInteger();
    private AtomicInteger sausagesQuantity = new AtomicInteger();

    public ProductsMonitor(int breadQuantity, int butterQuantity, int sausagesQuantity) {
        this.breadQuantity.set(breadQuantity);
        this.butterQuantity.set(butterQuantity);
        this.sausagesQuantity.set(sausagesQuantity);
    }

    public ProductsMonitor() {
    }

    public void addProducts(ProductsMonitor productsMonitor) {
        breadQuantity.addAndGet(productsMonitor.breadQuantity.get());
        butterQuantity.addAndGet(productsMonitor.butterQuantity.get());
        sausagesQuantity.addAndGet(productsMonitor.sausagesQuantity.get());
    }

    public void subtractProducts(ProductsMonitor productsMonitor) {
        breadQuantity.addAndGet(-productsMonitor.breadQuantity.get());
        butterQuantity.addAndGet(-productsMonitor.butterQuantity.get());
        sausagesQuantity.addAndGet(-productsMonitor.sausagesQuantity.get());
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
