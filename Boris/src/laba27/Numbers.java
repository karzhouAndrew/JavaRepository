package laba27;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers implements ClearDuplicates, AddRandomNumber {
    private List<Integer> numbersArray = new ArrayList<Integer>();


    @Override
    public void addRandomNumbers(int quantity) {
        Random rand = new Random();
        for (int i = 0; i < quantity; i++) {
            numbersArray.add(rand.nextInt(100));
        }
    }

    @Override
    public void clearDuplicates() {
        int uniqueNumberIndex = 0;
        while (uniqueNumberIndex < numbersArray.size()) {
            int compareIndex = uniqueNumberIndex + 1;
            while (compareIndex < numbersArray.size()) {
                if (numbersArray.get(uniqueNumberIndex) == numbersArray.get(compareIndex)) {
                    numbersArray.remove(compareIndex);
                } else {
                    compareIndex++;
                }
            }
            uniqueNumberIndex++;
        }
    }

    @Override
    public String toString() {
        return "Numbers {" +
                "numbersArray=" + numbersArray +
                '}';
    }
}
