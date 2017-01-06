package park.plant.tree.trees;


import park.plant.tree.Tree;

public class Maple extends Tree {
    private static final double GROW_UP = 1;
    private static final double THICKNESS_UP = 0.1;

    public Maple(String name, int height, int thickness) {
        super(name, height, thickness);
    }

    @Override
    public void grow() {
        setHeight(getHeight() + GROW_UP);
        setThickness(getThickness() + THICKNESS_UP);
    }
}
