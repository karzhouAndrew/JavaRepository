package lab32;

/* Задание 32. Записать в двоичный файл 20 случайных чисел.
Прочитать записанный файл, распечатать числа и их среднее арифметическое. */

import java.util.Arrays;
import java.util.List;

public class Task32 {

    private static final String DATA_FILE_PATH = "./Dudinsky/src/lab32/numbers.dat";
    private static final int QUANTITY = 20;

    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessor();
        double[] randomDoubles = numberProcessor.getRandomDoubles(QUANTITY);
        System.out.println("Случайные числа: " + Arrays.toString(randomDoubles));
        DataFileServer server = new DataFileServer();
        server.writeDoublesArray(randomDoubles, DATA_FILE_PATH);

        List<Double> retrievedFromFile = server.retrieveAllDoublesFrom(DATA_FILE_PATH);
        System.out.println("Получены из файла: " + retrievedFromFile);
        System.out.println("Среднее арифметическое: " + numberProcessor.calcAverage(retrievedFromFile));
    }
}
