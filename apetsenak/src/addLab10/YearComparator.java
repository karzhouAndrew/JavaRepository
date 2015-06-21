package addLab10;


import java.util.Comparator;
import java.util.Map;

public class YearComparator implements Comparator<Integer> {
    Map<Integer, Car> carMap;

    public YearComparator(Map<Integer, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (carMap.get(o1).getProductionYear() == carMap.get(o2).getProductionYear()) {
            if (carMap.get(o1).getBrand().compareTo(carMap.get(o2).getBrand()) == 0) {
                if (carMap.get(o1).getModel().compareTo(carMap.get(o2).getModel()) == 0) {
                    if (carMap.get(o1).getPrice() == carMap.get(o2).getPrice()) {
                        return o1 - o2;
                    }
                    return carMap.get(o1).getPrice() - carMap.get(o2).getPrice();
                }
                return carMap.get(o1).getModel().compareTo(carMap.get(o2).getModel());
            }
            return carMap.get(o1).getBrand().compareTo(carMap.get(o2).getBrand());
        }
        return carMap.get(o1).getProductionYear() - carMap.get(o2).getProductionYear();
    }
}
