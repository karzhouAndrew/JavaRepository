package laba32;

//Записать в двоичный файл 20 случайных чисел. Прочитать записан-ный файл,
//        распечатать числа и их среднее арифметическое.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryFile {
    private File file;

    public BinaryFile(File file) {
        this(file.toString());
    }

    public BinaryFile(String str) {
        this.file = new File(str);
    }

    public void writeNumberToBinaryFile(int quantity) {
        DataOutputStream outputFile = null;
        try {
            outputFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            writeNumbersListToFile(addRandomNumbers(quantity), outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Exception opened file.");
        } catch (IOException e) {
            System.out.println("Exception add numbers.");
        } finally {
            if (outputFile != null) {
                try {
                    outputFile.close();
                } catch (IOException e) {
                    System.out.println("Exception closed file.");
                }
            }
        }
    }

    private void writeNumbersListToFile(List<Integer> numbers, DataOutputStream outputFile) throws IOException {
        for (Integer number : numbers) {
            outputFile.writeInt(number);
        }
    }

    private List<Integer> addRandomNumbers(int quantity) {
        List<Integer> numbers = new ArrayList<>();
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                numbers.add(getRandomNumber());
            }
        } else {
            for (int i = quantity; i < 0; i++) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private Integer getRandomNumber() {
        return new Random().nextInt(10);
    }

    public List<Integer> getNumbersFromBinaryFile() {
        List<Integer> numbers = new ArrayList<>();
        DataInputStream reader = null;
        try {
            reader = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            getNumbers(reader, numbers);
        } catch (FileNotFoundException e) {
            System.out.println("Exception opened file.");
        } catch (IOException e) {
            System.out.println("Exception read file.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Exception closed file.");
                }
            }
        }
        return numbers;
    }

    private void getNumbers(DataInputStream reader, List<Integer> numbers) throws IOException {
        while (true) {
            try {
                numbers.add(reader.readInt());
            } catch (EOFException e) {
                break;
            }
        }
    }

    public double average() {
        List<Integer> numbers = getNumbersFromBinaryFile();
        double sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        } else {
            sum = getSum(numbers, sum);
            return sum / numbers.size();
        }
    }

    private double getSum(List<Integer> numbers, double sum) {
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

}
