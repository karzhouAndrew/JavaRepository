package task24;

public class ElectricCooker extends Cooker implements ControlTemperature {
    private double power;
    private TypeSurface surface;

    public ElectricCooker(double power, TypeSurface surface) {
        super();
        this.power = power;
        this.surface = surface;
    }

    @Override
    public void showState() {
        if (state) {
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
        double temperature = this.getTemperature();
        this.setTemperature(temperature++);
    }

    public void decreaseByOneDegree() {
        double temperature = this.getTemperature();
        this.setTemperature(temperature--);
    }

    public boolean warningInformation() {
        if (this.getTemperature() > 300) {
            return true;
        } else {
            return false;
        }
    }
}
