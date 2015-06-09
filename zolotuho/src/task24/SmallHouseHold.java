package task24;

public abstract class SmallHouseHold extends HouseHold {
    private double weight;
    private double cordLength;

    public SmallHouseHold(double weight, double cordLength) {
        this.weight = weight;
        this.cordLength = cordLength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }
}
