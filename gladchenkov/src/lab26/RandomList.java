package lab26;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class RandomList {
    public List<Integer> createRandomEstimateList(int capacity) {
        Random randomNumber = new Random();
        List<Integer> randomEstimates = new ArrayList<Integer>();
        for (int i = 0; i < capacity; i++) {
            randomEstimates.add(i, randomNumber.nextInt(11));
        }
        System.out.println(randomEstimates);
        return randomEstimates;
    }

    public List<Integer> deleteBadEstimate(List<Integer> editedEstimateList) {
        for (int i = 0; i < editedEstimateList.size(); i++) {
            if (editedEstimateList.get(i) < 4) {
                editedEstimateList.remove(i);
            }
        }
        System.out.println(editedEstimateList);
        return editedEstimateList;
    }
}
