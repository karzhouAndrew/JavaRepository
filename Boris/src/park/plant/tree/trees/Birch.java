package park.plant.tree.trees;


import park.plant.tree.Tree;

public class Birch extends Tree {
    private static final double GROW_UP = 2;
    private static final double THICKNESS_UP = 0.1;

    public Birch(String name, int height, int thickness) {
        super(name, height, thickness);
    }

    @Override
    public void grow() {
        setHeight(getHeight() + GROW_UP);
        setThickness(getThickness() + THICKNESS_UP);
    }
}
