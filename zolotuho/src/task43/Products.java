package task43;

public class Products {
    private int breadQuantity;
    private int butterQuantity;
    private int sausagesQuantity;

    public Products(int breadQuantity, int butterQuantity, int sausagesQuantity) {
        this.breadQuantity = breadQuantity;
        this.butterQuantity = butterQuantity;
        this.sausagesQuantity = sausagesQuantity;
    }

    public Products() {
    }

    public void addProducts(Products products) {
        breadQuantity = breadQuantity + products.breadQuantity;
        butterQuantity = butterQuantity + products.butterQuantity;
        sausagesQuantity = sausagesQuantity + products.sausagesQuantity;
    }

    public void subtractProducts(Products products) {
        breadQuantity = breadQuantity - products.breadQuantity;
        butterQuantity = butterQuantity - products.butterQuantity;
        sausagesQuantity = sausagesQuantity - products.sausagesQuantity;
    }

    public int getBreadQuantity() {
        return breadQuantity;
    }

    public void setBreadQuantity(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }

    public int getButterQuantity() {
        return butterQuantity;
    }

    public void setButterQuantity(int butterQuantity) {
        this.butterQuantity = butterQuantity;
    }

    public int getSausagesQuantity() {
        return sausagesQuantity;
    }

    public void setSausagesQuantity(int sausagesQuantity) {
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
