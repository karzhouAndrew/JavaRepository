package park.plant.bush.bushes;


import park.plant.bush.Bush;

public class Lilac extends Bush {
    private static final double GROW_UP = 1;

    public Lilac(String name, int height, int thunksQuantity) {
        super(name, height, thunksQuantity);
    }

    @Override
    public void grow() {
        setHeight(getHeight() + GROW_UP);
    }


}
