package add10;
import java.util.Comparator;
import java.util.Map;

public class YearSorting implements Comparator<Integer> {
    Map<Integer, AutoHouse> autoMap;

    public YearSorting(Map<Integer, AutoHouse> autoMap) {
        this.autoMap = autoMap;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(autoMap.get(o1).getGraduationYear() > autoMap.get(o2).getGraduationYear()) {
            return 1;
        }
        else if(autoMap.get(o1).getGraduationYear() < autoMap.get(o2).getGraduationYear()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
