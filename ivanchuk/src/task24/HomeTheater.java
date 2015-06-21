package task24;

public class HomeTheater extends EquipmentEntertainment {
    private String projectorBrand;

    public HomeTheater(String brand, String supportedFormats, String projectorBrand) {
        super(brand, supportedFormats);
        this.projectorBrand = projectorBrand;
    }

    public String getProjectorBrand() {
        return projectorBrand;
    }
}
