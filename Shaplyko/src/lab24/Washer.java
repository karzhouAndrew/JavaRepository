package lab24;

public class Washer extends WhiteGoods {
    private int laundryLoad;

    public Washer(String brandName, int laundryLoad) {
        super(brandName);
        this.laundryLoad = laundryLoad;
    }

    public int getLaundryLoad() {
        return laundryLoad;
    }

    public void setLaundryLoad(int laundryLoad) {
        this.laundryLoad = laundryLoad;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "laundryLoad=" + laundryLoad +
                '}';
    }
}

