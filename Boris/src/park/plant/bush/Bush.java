package park.plant.bush;


import park.plant.Plant;

public class Bush extends Plant {
    private static final double GROW_UP = 1;
    private int thunksQuantity;

    public Bush(String name, int height, int thunksQuantity) {
        super(name, height);
        this.thunksQuantity = thunksQuantity;
    }

    @Override
    public void grow() {
        super.setHeight(getHeight() + GROW_UP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bush bush = (Bush) o;

        if (thunksQuantity != bush.thunksQuantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + thunksQuantity;
        return result;
    }

    @Override
    public String toString() {
        return "Bush{" + super.toString() +
                "thunksQuantity=" + thunksQuantity +
                '}';
    }

    public int getThunksQuantity() {
        return thunksQuantity;
    }

    public void setThunksQuantity(int thunksQuantity) {
        this.thunksQuantity = thunksQuantity;
    }
}
