package port;

public class Ship {
    private int capacity;
    private int containerQuantity;
    private boolean unload;

    public Ship(int capacity, int containerQuantity, boolean loadingMode) {
        this.capacity = capacity;
        this.containerQuantity = containerQuantity;
        this.unload = loadingMode;
    }

    public int getContainerQuantity() {
        return containerQuantity;
    }

    public void setContainerQuantity(int containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    public boolean isUnload() {
        return unload;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLoadingMode(boolean unload) {
        this.unload = unload;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "capacity=" + capacity +
                ", containerQuantity=" + containerQuantity +
                ", unload=" + unload +
                '}';
    }
}
