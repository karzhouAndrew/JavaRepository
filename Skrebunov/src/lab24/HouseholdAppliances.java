package lab24;

/**
 * Created by PC on 17.06.2015.
 */
public abstract class HouseholdAppliances {
    private String brandName;
    private int weight;
    private boolean status;

    public HouseholdAppliances() {
    }

    public HouseholdAppliances(String brandName, int weight) {
        this.brandName = brandName;
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected abstract void switchOn();

    protected abstract void switchOff();

    protected abstract boolean statusOfDevice();

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "brandName='" + brandName + '\'' +
                ", weight=" + weight +
                '}';
    }
}