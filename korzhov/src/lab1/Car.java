package lab1;

/**
 * Created by User on 02.05.2015.
 */
public class Car {
    private int ID = 10;
    private String brandName;
    private String color;

    public Car() {
    }

    public Car(int ID) {
        System.out.println(this.ID);
        this.ID = ID;
    }

    public Car(String color, String brandName, int ID) {
        this.color = color;
        this.brandName = brandName;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Я удаляюсь");
        super.finalize();
    }
}
