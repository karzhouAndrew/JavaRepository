package lab24;


public class Iron extends HomeAppliances {
    private String soleplate;

    public Iron() {
        soleplate = "metal";
    }

    public Iron(String brandName, String name, int cordLength, String soleplate) {
        super(brandName, name, cordLength);
        this.soleplate = soleplate;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + soleplate;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this);
    }
}
