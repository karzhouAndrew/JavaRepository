package task24;

public abstract class SmallHouseHold extends HouseHold {
    private double weight;
    private double lengthOfCord;

    public SmallHouseHold(double weight, double lengthOfCord) {
        this.weight = weight;
        this.lengthOfCord = lengthOfCord;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLengthOfCord() {
        return lengthOfCord;
    }

    public void setLengthOfCord(double lengthOfCord) {
        this.lengthOfCord = lengthOfCord;
    }
}
