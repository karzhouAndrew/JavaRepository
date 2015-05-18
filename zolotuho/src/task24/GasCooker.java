package task24;



public class GasCooker extends Cooker {
    private double gasTubeDiameter;
    private ProcessMode modeOfCooking;

    public GasCooker(double gasTubeDiameter, ProcessMode modeOfCooking) {
        this.gasTubeDiameter = gasTubeDiameter;
        this.modeOfCooking = modeOfCooking;
    }

    @Override
    public void showState() {
        if (state) {
            System.out.println("Switched On");
        } else {
            System.out.println("Switched off");
        }
    }

    public double getGasTubeDiameter() {
        return gasTubeDiameter;
    }

    public void setGasTubeDiameter(double gasTubeDiameter) {
        this.gasTubeDiameter = gasTubeDiameter;
    }

    public ProcessMode getModeOfCooking() {
        return modeOfCooking;
    }

    public void setModeOfCooking(ProcessMode modeOfCooking) {
        this.modeOfCooking = modeOfCooking;
    }
}
