package lab27;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersCollection {
    private List<Integer> numbersList = new ArrayList<Integer>();

    public void fillList(int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbersList.add(random.nextInt(10));
        }
    }

    public void removeSameNumbers() {
        for (int i = 0; i < numbersList.size() - 1; i++) {
            for (int j = i + 1; j < numbersList.size(); j++) {
                if (numbersList.get(i) == numbersList.get(j)) {
                    numbersList.remove(j--);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder printString = new StringBuilder();
        for (int i = 0; i < numbersList.size(); i++) {
            printString.append(numbersList.get(i));
            printString.append("\n");
        }
        return printString.toString();
    }
}
