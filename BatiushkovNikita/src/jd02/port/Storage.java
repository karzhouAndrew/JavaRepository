package jd02.port;

public enum Storage {
    INSTANCE;

    private int capacity;

    public void serve(Ship ship) {
        if (ship.isLoaded()) {
            transferFromShipToStorage(ship);
        } else {
            transferFromStorageToShip(ship);
        }
    }

    private void transferFromShipToStorage(Ship ship) {
        int shipCapacity = ship.getCapacity();
        capacity += ship.getCapacity();
        System.out.println("Загружено на склад: " + shipCapacity);
        System.out.println("Остаток на складе: " + capacity);
        System.out.println();
    }

    private void transferFromStorageToShip(Ship ship) {
        int shipCapacity = ship.getCapacity();
        capacity -= ship.getCapacity();
        System.out.println("Загружено на корабль " + shipCapacity);
        System.out.println("Остаток на складе: " + capacity);
        System.out.println();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
