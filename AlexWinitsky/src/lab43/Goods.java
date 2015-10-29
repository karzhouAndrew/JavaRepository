package lab43;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 23.06.2015.
 */
public class Goods {
    private NameGoods name;
    private int price;
    private List<Goods> listGoods = new ArrayList<>();

    public Goods(NameGoods name) {
        this.name = name;
        this.price = name.getPrice();
    }

    public List<Goods> createListGoods() {
        for (NameGoods goods : NameGoods.values()) {
            listGoods.add(new Goods(goods));
        }
        return listGoods;
    }

    public Goods() {
    }

    public NameGoods getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printGoods(List<Goods> listGoods) {
        for (Goods goods : listGoods) {
            System.out.println(goods);
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                " name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
