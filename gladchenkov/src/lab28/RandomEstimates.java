package lab28;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.List;

public class RandomEstimates {
    public List<Integer> createRandomEstimateList(int capacity) {
        Random randomNumber = new Random();
        List<Integer> randomEstimates = new ArrayList<Integer>();
        for (int i = 0; i < capacity; i++) {
            randomEstimates.add(i, randomNumber.nextInt(20));
        }
        System.out.println(randomEstimates);
        return randomEstimates;
    }

    public int getMaxEstimate(List<Integer> randomNumbersList) {
        Iterator<Integer> iterator = randomNumbersList.iterator();
        int maxValue = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Максимальная оценка: " + maxValue);
        return maxValue;
    }
}


