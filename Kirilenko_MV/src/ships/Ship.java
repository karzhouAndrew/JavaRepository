package ships;

/**
 * Created by champion on 27.06.15.
 */
public class Ship {
    private int conteinersNumber;
    private String shipName;

    public Ship(int conteinersNumber, String shipName) {
        this.conteinersNumber = conteinersNumber;
        this.shipName = shipName;
    }

    public int getConteinersNumber() {
        return conteinersNumber;
    }

    public void setConteinersNumber(int conteinersNumber) {
        this.conteinersNumber = conteinersNumber;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return "Ship №" + shipName +
                "вместимостью " + conteinersNumber +
                " контейнеров";
    }
}
