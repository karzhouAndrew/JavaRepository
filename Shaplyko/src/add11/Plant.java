package add11;

import java.util.List;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (age != plant.age) return false;
        if (Double.compare(plant.height, height) != 0) return false;
        if (Double.compare(plant.speedGrow, speedGrow) != 0) return false;
        if (listPlant != null ? !listPlant.equals(plant.listPlant) : plant.listPlant != null) return false;
        if (name != null ? !name.equals(plant.name) : plant.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(speedGrow);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (listPlant != null ? listPlant.hashCode() : 0);
        return result;
    }
}
