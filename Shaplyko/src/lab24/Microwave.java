package lab24;

public class Microwave extends WhiteGoods {
    private int power;

    public Microwave(String brandName, int power) {
        super(brandName);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "power=" + power +
                '}';
    }
}

