package lab24;


public class VacuumCleaner extends HomeAppliances {
    private String dustCollector;

    public VacuumCleaner() {
        dustCollector = "bag";
    }

    public VacuumCleaner(String brandName, String name, int cordLength, String dustCollector) {
        super(brandName, name, cordLength);
        this.dustCollector = dustCollector;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + dustCollector;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this);
    }
}
