package jd02.port;

public class Ship {
    private int capacity = Util.generateRandomInt(10, 50);
    private boolean loaded = Util.generateRandomBool();

    public Ship() {

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
