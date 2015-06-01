package lab28;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */
public class Lab28Main {
    public static void main(String[] args) {
        RandomEstimates randomNumbers = new RandomEstimates();
        randomNumbers.getMaxEstimate(randomNumbers.createRandomEstimateList(10));
    }
}

