package garden.plants;


public class Tree extends Plant {
    private int trunkWidth;

    public Tree(String name, int age, int length, int trunkWidth) {
        super(name, age, length);
        this.trunkWidth = trunkWidth;
    }

    public Tree() {
    }

    @Override
    public void grow() {
        setAge(getAge() + 1);
        setHeight(getHeight() + 1);
        trunkWidth++;
    }

    public int getTrunkWidth() {
        return trunkWidth;
    }

    public void setTrunkWidth(int trunkWidth) {
        this.trunkWidth = trunkWidth;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", trunkWidth=" + trunkWidth +
                '}';
    }
}
