package lab27;

public class Lab27Main {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.removeDuplicateNumbers(randomNumbers.createRandomNumbersList(20));
    }
}
