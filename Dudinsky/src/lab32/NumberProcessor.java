package lab32;

import java.util.List;
import java.util.Random;

public class NumberProcessor {
    public double[] getRandomDoubles(int quantity) {
        Random rand = new Random();
        double[] resultArray = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            resultArray[i] = rand.nextDouble();
        }
        return resultArray;
    }

    public double calcAverage(List<Double> doubleList) {
        double sum = 0;
        for (double current : doubleList) {
            sum += current;
        }
        return sum / doubleList.size();
    }
}
