package park.plant.bush.bushes;


import park.plant.bush.Bush;

public class Acacia extends Bush {
    private static final double GROW_UP = 0.5;

    public Acacia(String name, int height, int thunksQuantity) {
        super(name, height, thunksQuantity);
    }

    @Override
    public void grow() {
        setHeight(getHeight());
    }


}
