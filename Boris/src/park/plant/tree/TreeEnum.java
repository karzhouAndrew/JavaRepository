package park.plant.tree;


import park.plant.tree.trees.Birch;
import park.plant.tree.trees.Maple;
import park.plant.tree.trees.Oak;

public enum TreeEnum {
    BIRCH {
        @Override
        public Tree getTree() {
            return new Birch("Birch", 0, 0);
        }
    },
    MAPLE {
        @Override
        public Tree getTree() {
            return new Maple("Maple", 0, 0);
        }
    },
    OAK {
        @Override
        public Tree getTree() {
            return new Oak("Oak", 0, 0);
        }
    };

    public abstract Tree getTree();

}
