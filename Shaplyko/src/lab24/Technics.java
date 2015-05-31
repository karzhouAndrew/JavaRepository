package lab24;

public class Technics {
    private String brandName;

    public Technics() {
    }

    public Technics(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Technics{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}

