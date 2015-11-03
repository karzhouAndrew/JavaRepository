package jd02park.entity;

public abstract class Plant {

    private PlantKindEnum kind;
    private double height;

    public Plant(PlantKindEnum kind, double height) {
        this.kind = kind;
        this.height = height;
    }

    public void growPerYear() {
        height += kind.getAverageAnnualGrowth();
    }

    public abstract void fertilize();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public PlantKindEnum getKind() {
        return kind;
    }

    public void setKind(PlantKindEnum kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.height, height) != 0) return false;
        if (kind != plant.kind) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + kind.hashCode();
        return result;
    }
}
