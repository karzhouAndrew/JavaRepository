package task24;

public class ElectricCooker extends Cooker implements ControlTemperature {
    private double power;
    private TypeSurface surface;

    public ElectricCooker(double power,TypeSurface surface) {
        super();
        this.power = power;
        this.surface=surface;
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
    public void setTemperature(double temperature,double temperature1) {

    }
    @Override
    public void setTemperature(double temperature) {
        super.temperature = temperature;
    }

    public void increaseByOneDegree() {
        super.temperature++;
    }

    public void decreaseByOneDegree() {
        super.temperature--;
    }

    public boolean warningInformation() {
        if (super.temperature > 300) {
            return true;
        } else {
            return false;
        }
    }
}
