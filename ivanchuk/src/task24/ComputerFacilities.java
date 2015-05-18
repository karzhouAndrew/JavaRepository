package task24;

public abstract class ComputerFacilities extends HouseholdAppliances {
    private double processorPower;

    public ComputerFacilities(String brand, double processorPower) {
        super(brand);
        this.processorPower = processorPower;
    }

    public double getProcessorPower() {
        return processorPower;
    }
}
