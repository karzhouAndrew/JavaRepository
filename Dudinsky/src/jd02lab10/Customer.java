package jd02lab10;

import java.util.List;

public class Customer {
    private int id;
    private List<String> goods;

    public Customer(int id, List<String> goods) {
        this.id = id;
        this.goods = goods;
    }

    public int getId() {
        return id;
    }

    public List<String> getGoods() {
        return goods;
    }
}
