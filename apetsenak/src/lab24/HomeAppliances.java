package lab24;


public class HomeAppliances extends Appliances {
    private int cordLength;

    public HomeAppliances() {
        cordLength = 1;
    }

    public HomeAppliances(String brandName, String name, int cordLength) {
        super(brandName, name);
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cordLength;
    }

    @Override
    public void turnOn() {
        System.out.println("Включить. Техника для дома.");
    }
}
