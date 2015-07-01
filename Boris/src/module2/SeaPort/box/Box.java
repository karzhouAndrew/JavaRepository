package module2.SeaPort.box;


import java.util.Random;

public class Box {
    private int mass;

    public Box() {
        mass = generateMass();
    }

    public Box(int mass) {
        this.mass = mass;
    }

    private int generateMass() {
        return new Random().nextInt(50);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Box{" +
                "mass=" + mass +
                '}';
    }


}
