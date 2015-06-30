package lab24;

public abstract class WhiteGoods extends Technics {
    private boolean plugged;

    public WhiteGoods(String brandName) {
        super(brandName);

    }

    public void pluggedIn(String brandName) {
        plugged = true;
    }

    public void unplugged(String brandName) {
        plugged = false;
    }

    public boolean getPlugged() {
        return plugged;
    }
}
