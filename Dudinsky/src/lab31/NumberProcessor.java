package lab31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class NumberProcessor {

    public double calcSum(List<Double> list) {
        double sum = .0;
        for (double currentNum : list) {
            sum += currentNum;
        }
        return sum;
    }

    public void removeAllRepeatsIn(List<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            Iterator<Double> iterator = list.listIterator(i);
            double currentElement = iterator.next();
            while (iterator.hasNext()) {
                if (iterator.next() == currentElement) {
                    iterator.remove();
                }
            }
        }
    }

    public List<Double> passThroughTheSet(List<Double> list) {
        return new ArrayList<Double>(new HashSet<Double>(list));
    }
}
