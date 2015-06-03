package additionalTask10;

public class Car {
    private static int carsQuantity;
    private final int ID;
    private final String BRAND;
    private final int RELEASE_YEAR;
    private final int ADDITION_DATE;
    private int price;

    public Car(String brand, int releaseYear, int price, int additionData) {
        ID = carsQuantity;
        carsQuantity++;
        ADDITION_DATE = additionData;
        BRAND = brand;
        RELEASE_YEAR = releaseYear;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return ID != car.ID;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (BRAND != null ? BRAND.hashCode() : 0);
        result = 31 * result + RELEASE_YEAR;
        result = 31 * result + ADDITION_DATE;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "'" + BRAND + "'" +
                ", год выпуска: " + RELEASE_YEAR +
                ", цена: " + price +
                ", дата добавления: " + ADDITION_DATE +
                " ID=" + ID;
    }

    public int getID() {
        return ID;
    }

    public String getBrand() {
        return BRAND;
    }

    public int getReleaseYear() {
        return RELEASE_YEAR;
    }

    public int getPrice() {
        return price;
    }

    public int getAdditionDate() {
        return ADDITION_DATE;
    }
}
