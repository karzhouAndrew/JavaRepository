package auto;

import java.util.*;

/**
 * Created by asus on 25.05.2015.
 */
public class AutoHauseUtilsImpl implements AutoHauseUtils {
    @Override
    public Map<java.util.Date, List<Car>> SortWithTreeMap(List<Car> cars) {
        Map<java.util.Date, List<Car>> carMap = new TreeMap<java.util.Date, List<Car>>();
        for (Car car : cars) {
            if (carMap.containsKey(car.getAge())) {
                List<Car> carList = carMap.get(car.getAge());
                carList.add(car);
                carMap.put(car.getAge(), carList);
            } else {
                List<Car> carList = new ArrayList<Car>();
                carList.add(car);
                carMap.put(car.getAge(), carList);
            }
        }
        return carMap;
    }

    @Override
    public void ShowMap(Map<java.util.Date, List<Car>> carMap) {
        for (List<Car> carList : carMap.values()) {
            for (Car car : carList) {
                System.out.println(car.getId() + " : " + car.getBrand() + " " + car.getModel() + " " + car.getAge() + " " + car.getPrice());
            }
        }
    }

    @Override
    public void ShowCollection(Collection<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getId() + "   " + car.getBrand() + "   " + car.getModel() + "    " + car.getAge() + "  " + car.getPrice());
        }
    }

}
