package laba9;

//There is natural sequences. Find Max number.
public class MaxNumber {
    public static void main(String[] args) {
        int randomValue = (int) (Math.random() * 10);
        int maxNumber = randomValue;
        while (randomValue != 0) {
            if (maxNumber < randomValue) {
                maxNumber = randomValue;
            }
            System.out.print(" " + randomValue);
            randomValue = (int) (Math.random() * 10);
        }
        System.out.println("\nМаксимальное число в последовательности равно " + maxNumber);
    }
}