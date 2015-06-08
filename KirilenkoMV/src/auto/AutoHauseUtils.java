package auto;

import java.util.*;

/**
 * Created by asus on 25.05.2015.
 */
public interface AutoHauseUtils {
    public Map<Date, List<Car>> SortWithTreeMap(List<Car> cars);
    public void ShowMap(Map<java.util.Date, List<Car>> carMap);
    public void ShowCollection(Collection<Car> cars);
}
