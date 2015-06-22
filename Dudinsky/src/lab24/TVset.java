package lab24;

public class TVset extends HomeAudioVideoEquipment {

    private double diagonalSize;

    public TVset(String brandName, String model, double powerConsumption, boolean USBPortPresence, double diagonalSize) {
        super(brandName, model, powerConsumption, USBPortPresence);
        this.diagonalSize = diagonalSize;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("телевизор. Как там наши сегодня сыграли?");
    }

    @Override
    public String toString() {
        return super.toString() + ", размер диагонали = " + diagonalSize;
    }

    public double getDiagonalSize() {
        return diagonalSize;
    }
}
