package lab43;

/**
 * Created by Master on 23.06.2015.
 */
public enum NameGoods {
    APPLE(2), PEACH(20), ORANGE(5), PEAR(12), PLUM(7), CHERRY(15), STRAWBERRY(14), POTATO(8), ONION(5), PUMPKIN(6);
    private int price;

    NameGoods(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

