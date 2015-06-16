package add10;

import java.util.Comparator;
import java.util.Map;

public class PriceComparator implements Comparator<Integer> {
    private Map<Integer, Car> autoMap;

    public PriceComparator(Map<Integer, Car> autoMap) {
        this.autoMap = autoMap;
    }

    @Override
    public int compare(Integer car1, Integer car2) {
        int priceCar1 = autoMap.get(car1).getPrice();
        int priceCar2 = autoMap.get(car2).getPrice();
        return priceCar1 < priceCar2 ? 1 : priceCar1 == priceCar2 ? 0 : -1;
    }
}
