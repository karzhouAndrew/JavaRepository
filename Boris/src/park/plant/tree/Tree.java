package park.plant.tree;


import park.plant.Plant;

public abstract class Tree extends Plant {
    private double thickness;

    public Tree(String name, int height, int thickness) {
        super(name, height);
        this.thickness = thickness;
    }

    @Override
    public abstract void grow();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tree tree = (Tree) o;

        if (Double.compare(tree.thickness, thickness) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" + super.toString() +
                "thickness=" + thickness +
                '}';
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
