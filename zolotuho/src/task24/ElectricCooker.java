package task24;

public class ElectricCooker extends Cooker implements ControlTemperature {
    private double power;
    private TypeSurface surface;
    private final double temperatureLimit;

    public ElectricCooker(double power, TypeSurface surface, double temperatureLimit) {
        super();
        this.power = power;
        this.surface = surface;
        this.temperatureLimit = temperatureLimit;
    }

    @Override
    public void showState() {
        if (state == true) {
            System.out.println("Electric cooker switched On");
        } else {
            System.out.println("Electric cooker switched off");
        }
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void setTemperature(double temperature, double temperature1) {
    }

    @Override
    public void setTemperature(double temperature) {
        setTemperature(temperature);
    }

    public void increaseByOneDegree() {
        double temperature = getTemperature();
        setTemperature(temperature++);
    }

    public void decreaseByOneDegree() {
        double temperature = getTemperature();
        setTemperature(temperature--);
    }

    public boolean warningInformation() {
        return getTemperature() > temperatureLimit ? true : false;
    }
}
