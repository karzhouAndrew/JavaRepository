package lab27;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class RandomNumbers {
    public List<Integer> createRandomNumbersList(int capacity) {
        Random randomNumber = new Random();
        List<Integer> randomEstimates = new ArrayList<Integer>();
        for (int i = 0; i < capacity; i++) {
            randomEstimates.add(i, randomNumber.nextInt(20));
        }
        System.out.println(randomEstimates);
        return randomEstimates;
    }

    public List<Integer> removeDuplicateNumbers(List<Integer> randomNumbersList) {
        for (int i = 0; i < randomNumbersList.size(); i++) {
            for (int j = 0; j < randomNumbersList.size(); j++) {
                if (randomNumbersList.get(i).equals(randomNumbersList.get(j)) && i != j) {
                    randomNumbersList.remove(j);
                }
            }
        }
        System.out.println(randomNumbersList);
        return randomNumbersList;
    }
}
