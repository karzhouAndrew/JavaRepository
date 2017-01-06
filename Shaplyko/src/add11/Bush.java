package add11;

public class Bush extends Plant {
    private int amountTrunk;

    public Bush(String name, double height, int age, double speedGrow, int amountTrunk) {
        super(name, height, age, speedGrow);
        this.amountTrunk = amountTrunk;
    }

    public Bush() {
    }

    public void grow(int age) {
        this.setHeight(this.getHeight() + age * 0.9 * this.getSpeedGrow());
    }

    public int getAmountTrunk() {
        return amountTrunk;
    }

    public void setAmountTrunk(int numberTrunk) {
        this.amountTrunk = numberTrunk;
    }

    public String toString() {
        return "Bush{" +
                " name='" + this.getName() + '\'' +
                " height=" + this.getHeight() +
                " age=" + this.getAge() +
                " speedGrow='" + this.getSpeedGrow() + '\'' +
                " amountTrunk='" + getAmountTrunk() + '\'' +
                '}';
    }

}
