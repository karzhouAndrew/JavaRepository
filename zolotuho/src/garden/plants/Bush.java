package garden.plants;


public class Bush extends Plant {
    private int trunksQuantity;

    public Bush(String name, int age, int length, int trunksQuantity) {
        super(name, age, length);
        this.trunksQuantity = trunksQuantity;
    }

    public Bush() {
    }

    @Override
    public void grow() {
        setAge(getAge() + 1);
        setHeight(getHeight() + 1);
        trunksQuantity += 3;
    }

    public int getTrunksQuantity() {
        return trunksQuantity;
    }

    public void setTrunksQuantity(int trunksQuantity) {
        this.trunksQuantity = trunksQuantity;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", trunksQuantity=" + trunksQuantity +
                '}';
    }
}
