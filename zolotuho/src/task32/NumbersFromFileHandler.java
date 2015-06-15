package task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Записать в двоичный файл 20 случайных чисел.
// Прочитать записанный файл, распечатать числа и их среднее арифметическое.
public class NumbersFromFileHandler {
    public void writeRandomNumbersToFile(File path, int limit) throws IOException {
        Random random = new Random();
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
        int currentIteration = 0;
        while (currentIteration < limit) {
            dataOutputStream.writeInt(random.nextInt(100));
            currentIteration++;
        }
        dataOutputStream.close();
    }

    public List<Integer> readFile(File path) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
        List<Integer> containedData = new ArrayList<Integer>();
        while (true) {
            try {
                containedData.add(dataInputStream.readInt());
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();
        return containedData;
    }

    public double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) throws IOException {
        File path = new File("./src/task32/task32.dat");
        try {
            NumbersFromFileHandler numbersFromFileHandler = new NumbersFromFileHandler();
            numbersFromFileHandler.writeRandomNumbersToFile(path, 20);
            System.out.println("data from file");
            System.out.println(numbersFromFileHandler.readFile(path));
            System.out.println("average");
            System.out.println(numbersFromFileHandler.calculateAverage(numbersFromFileHandler.readFile(path)));
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
