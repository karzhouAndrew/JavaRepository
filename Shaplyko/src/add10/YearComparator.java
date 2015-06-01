package add10;

import java.util.Comparator;
import java.util.Map;

public class YearComparator implements Comparator<Integer> {
    private Map<Integer, Car> autoMap;

    public YearComparator(Map<Integer, Car> autoMap) {
        this.autoMap = autoMap;
    }

    @Override
    public int compare(Integer car1, Integer car2) {
        int yearCar1 = autoMap.get(car1).getGraduationYear();
        int yearCar2 = autoMap.get(car2).getGraduationYear();
        return yearCar1 < yearCar2 ? 1 : yearCar1 == yearCar2 ? 0 : -1;
    }
}