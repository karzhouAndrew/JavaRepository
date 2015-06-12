package laba24;

//Бытовая техника
public abstract class HouseAppliances {
    private String brand;
    private String price;
    private boolean isTurnOn;

    public HouseAppliances(String brand, String price, boolean isTurnOn) {
        this.brand = brand;
        this.price = price;
        this.isTurnOn = isTurnOn;
    }

    public HouseAppliances(String brand) {
        this.brand = brand;
    }

    protected void switcher() {
        isTurnOn = isTurnOn ? false : true;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean isTurnOn) {
        this.isTurnOn = isTurnOn;
    }
}
