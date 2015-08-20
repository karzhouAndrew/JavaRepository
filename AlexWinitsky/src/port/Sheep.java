package port;

/**
 * Created by Master on 24.06.2015.
 */
public class Sheep extends Thread {
    private int freeSpace;
    private int totalSpace;
    private String nameSheep;
    private Boolean shipment;
    private int result;


    private boolean reading = false;
    private PoolDocks<Dock> poolDocks;

    public void setPool(PoolDocks<Dock> pool) {
        this.poolDocks = pool;
    }

    public Sheep(String nameSheep, int totalSpace, int freeSpace, boolean shipment) {
        this.freeSpace = freeSpace;
        this.nameSheep = nameSheep;
        this.totalSpace = totalSpace;
        this.shipment = shipment;
    }

    public Sheep() {
    }

    public String getNameSheep() {
        return nameSheep;
    }

    public void setNameSheep(String nameSheep) {
        this.nameSheep = nameSheep;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public int getResult() {
        return result;
    }

    public Boolean getShipment() {
        return shipment;
    }

    public void setShipment(Boolean shipment) {
        this.shipment = shipment;
    }


    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public int shipmentSheep(int numberContainer) {
        int resultShipment = 0;
        if (numberContainer > freeSpace) {
            resultShipment = freeSpace;
        } else {
            resultShipment = numberContainer;
        }
        result = resultShipment;
        return resultShipment;
    }

    public int unloadingSheep(int numberContainer) {
        int resultShipment = 0;
        if (numberContainer > (totalSpace - freeSpace)) {
            resultShipment = totalSpace - freeSpace;
        } else {
            resultShipment = numberContainer;
        }
        result = resultShipment;
        return resultShipment;
    }

    public void run() {

        Store store = new Store();
        Dock dock = null;
        try {
            dock = poolDocks.getResource(100);
            reading = true;
            dock.shipmentUploading(this);
        } catch (ResourceException e) {
            System.out.println("Корабль " + this.getNameSheep() + " не обслужен"
                    + e.getMessage());
        } finally {
            if (dock != null) {
                reading = false;
                System.out.println(dock.getName() + "\n" +
                        "Корабль " + this.getNameSheep() + " выгружено/разгружено " + this.getResult() + "\n" +
                        "Свободное место на складе после погрузки/разгрузки " + store.getFreeSpaceStore() + "\n" +
                        "Корабль " + this.getNameSheep() + " освободил причал " + dock.getName() + "\n");
                poolDocks.returnResource(dock);
            }
        }
    }

    public boolean isReading() {
        return reading;
    }

}
