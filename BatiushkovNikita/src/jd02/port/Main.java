package jd02.port;


public class Main {
    public static final int SHIPS_QUANTITY = 10;
    public static final int BERTH_QUANTITY = 3;
    public static final int STORAGE_CAPACITY = 300;

    public static void main(String[] args) {
        Flotilla flotilla = new Flotilla(SHIPS_QUANTITY);
        PortManager portManager = new PortManager(flotilla, BERTH_QUANTITY);
        Storage.INSTANCE.setCapacity(STORAGE_CAPACITY);

        portManager.startRegulation();
    }
}
