package lab43;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 23.06.2015.
 */
public class CustomerGoods {
    private List<CustomerGoods> listCustomer = new ArrayList<>();
    private int count;
    private Goods goods;

    public CustomerGoods(Goods goods,int count) {
        this.count = count;
        this.goods = goods;
    }

    public CustomerGoods() {

    }

    public int getCount() {
        return count;
    }

    public Goods getGoods() {
        return goods;
    }


    public List<CustomerGoods> doShopping() {
        List<Goods> listGoods = new Goods().createListGoods();
        for (int i = 0; i < (1 + (int) (5 * Math.random())); i++) {
            int count = 1 + (int) (10 * Math.random());
            if (count > 0) {
                listCustomer.add(new CustomerGoods(listGoods.get((int) (5 * Math.random())), count));
            }
        }
        return listCustomer;
    }
}
