package park.plant;

import java.util.List;

/**
 * Created by Master on 21.06.2015.
 */
public class Plant {
    private String name;
    private int age;
    private double height;
    private double speedGrow;
    private List<Plant> listPlant;


    public Plant(String name, double height, int age, double speedGrow) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.speedGrow = speedGrow;
    }

    public Plant() {
    }

    public void grow(int age) {
        this.setHeight(this.height + age * this.getSpeedGrow());
    }

    public void toPlant(Plant plant) {
        listPlant.add(plant);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Plant> getListPlant() {
        return listPlant;
    }

    public void setListPlant(List<Plant> listPlant) {
        this.listPlant = listPlant;
    }

    public double getSpeedGrow() {
        return speedGrow;
    }

    public void setSpeedGrow(double speedGrow) {
        this.speedGrow = speedGrow;
    }

    @Override
    public String toString() {
        return "Plant{" +
                " age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", listPlant=" + listPlant +
                '}';
    }
}
