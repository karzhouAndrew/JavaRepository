package task28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

public class RandomNumbersCollection {
    private List<Integer> randomNumbers = new ArrayList<>();

    public void fillRandomNumber(int length) {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            randomNumbers.add(rand.nextInt(100));
        }
    }

    public HashSet<Integer> convertToSet() {
        return new HashSet<>(randomNumbers);
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(List<Integer> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public static void main(String[] args) {
        RandomNumbersCollection randomNumbers = new RandomNumbersCollection();
        randomNumbers.fillRandomNumber(20);
        System.out.println("Random randomNumbers");
        System.out.println(randomNumbers.getRandomNumbers());
        System.out.println("random randomNumbers without repetitive randomNumbers");
        System.out.println(randomNumbers.convertToSet());
    }
}
