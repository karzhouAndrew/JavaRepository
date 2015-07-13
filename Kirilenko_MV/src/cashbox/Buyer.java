package cashbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by champion on 25.06.15.
 */
public class Buyer {
    private List<Goods> goods = new ArrayList<Goods>();
    private String name;
    public Buyer(String name) {
        this.name = name;
    }

    public void addGoods() {
        Random random = new Random();
        int goodsNumber = random.nextInt(10);
        Goods[] allGoods = Goods.values();
        for (int i = 0; i < goodsNumber; i++) {
            int goodsPosition = random.nextInt(Goods.values().length);
            goods.add(allGoods[goodsPosition]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
