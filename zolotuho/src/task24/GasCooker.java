package task24;

public class GasCooker extends Cooker {
    private double gasTubeDiameter;
    private ProcessMode cookingMode;

    public GasCooker(double gasTubeDiameter, ProcessMode cookingMode) {
        this.gasTubeDiameter = gasTubeDiameter;
        this.cookingMode = cookingMode;
    }

    @Override
    public void showState() {
        if (state == true) {
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

    public ProcessMode getCookingMode() {
        return cookingMode;
    }

    public void setCookingMode(ProcessMode cookingMode) {
        this.cookingMode = cookingMode;
    }
}
