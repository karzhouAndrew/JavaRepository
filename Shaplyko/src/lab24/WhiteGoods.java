package lab24;

public class WhiteGoods extends Technics {
    private String plugged;

    public void pluggedIn(String brandName) {
        plugged = "is included";
    }

    public void unplugged(String brandName) {
        plugged = "disabled";
    }

    public String getPlugged() {
        return plugged;
    }
}

