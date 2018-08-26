package jd02.port;

public class Ship {
    private int capacity;
    private boolean loaded;

    public Ship() {
        this.capacity = Util.generateRandomInt(10, 50);
        this.loaded = Util.generateRandomBool();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "initialCapacity=" + capacity +
                ", loaded=" + loaded +
                '}';
    }
}
