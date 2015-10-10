package park.plant;

/**
 * Created by Master on 21.06.2015.
 */
public class Bush extends Plant {
    private int numberTrunk;

    public Bush(String name, double height, int age, double speedGrow, int numberTrunk) {
        super(name, height, age, speedGrow);
        this.numberTrunk = numberTrunk;
    }

    public Bush() {
    }

    public void grow(int age) {
        this.setHeight(this.getHeight() + age * 1.1*this.getSpeedGrow());
    }
    public int getNumberTrunk() {
        return numberTrunk;
    }

    public void setNumberTrunk(int numberTrunk) {
        this.numberTrunk = numberTrunk;
    }

    public String toString() {
        return "Bush{" +
                " name='" + this.getName() + '\'' +
                " height=" + this.getHeight() +
                " age=" + this.getAge() +
                " speedGrow='" + this.getSpeedGrow() + '\'' +
                " numberTrunk='" + getNumberTrunk() + '\'' +
                '}';
    }

}
