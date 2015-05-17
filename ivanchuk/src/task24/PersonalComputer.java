package task24;

public class PersonalComputer extends ComputerFacilities {
    private String monitorBrand;

    public PersonalComputer(String brand, double processorPower, String monitorBrand) {
        super(brand, processorPower);
        this.monitorBrand = monitorBrand;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }
}
