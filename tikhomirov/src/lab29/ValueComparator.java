package lab29;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Юленька on 31.05.2015.
 */
public class ValueComparator implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
        return (int) o1.getValue().compareTo(o2.getValue());
    }
}
