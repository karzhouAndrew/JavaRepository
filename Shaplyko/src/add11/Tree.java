package add11;

public class Tree extends Plant {
    public Tree() {

    }

    public Tree(String name, double height, int age, double speedGrow) {
        super(name, height, age, speedGrow);
    }

    public void grow(int age) {
        this.setHeight(this.getHeight() + age * 1.3 * this.getSpeedGrow());
    }

    public String toString() {
        return "Tree{" +
                " name='" + this.getName() + '\'' +
                " height=" + this.getHeight() +
                " age=" + this.getAge() +
                " speedGrow='" + this.getSpeedGrow() + '\'' +
                '}';
    }
}
