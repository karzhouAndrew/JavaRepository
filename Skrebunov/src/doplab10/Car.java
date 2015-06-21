package doplab10;

/*Описываем систему AutoHouse. В автохаусе на данный момент есть несколько различных машин.
У каждой машины свой уникальный идентификатор.

Реализовать следующие функции.
1) Добавление и удаление новых машин в/из автохаус(а).
2) Поиск машин по марке.
3) Поиск машин по году выпуска.
4) Сортировка по году.
5) Сортировка по цене.

Реализовать консольное меню.*/

public class Car {
    private String brandName;
    private String model;
    private int price;
    private int constructionYear;
    private int registrationYear;
    private int identifier;
    private static int identifierStatic = 1;

    public Car() {
    }

    public Car(String brandName, String model, int price, int constructionYear, int registrationYear, int identifier) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
        this.constructionYear = constructionYear;
        this.registrationYear = registrationYear;
        this.identifier = identifier + identifierStatic;
        identifierStatic++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public static int getIdentifierStatic() {
        return identifierStatic;
    }

    public static void setIdentifierStatic(int identifierStatic) {
        Car.identifierStatic = identifierStatic;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", constructionYear=" + constructionYear +
                ", registrationYear=" + registrationYear +
                ", identifier=" + identifier +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (constructionYear != car.constructionYear) return false;
        if (identifier != car.identifier) return false;
        if (price != car.price) return false;
        if (registrationYear != car.registrationYear) return false;
        if (brandName != null ? !brandName.equals(car.brandName) : car.brandName != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brandName != null ? brandName.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + constructionYear;
        result = 31 * result + registrationYear;
        result = 31 * result + identifier;
        return result;
    }
}

