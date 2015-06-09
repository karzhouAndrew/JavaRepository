package lab32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {
    private File file;
    private List<Integer> numbers = new ArrayList();

    public BinaryFile(String path) {
        this.file = new File(path);
    }

    private List generateNumbers(int amount) {
        for (int i = 0; i < amount; i++) {
            numbers.add(i, (int) (Math.random() * 10 + 1));
        }
        return numbers;
    }

    public double average() {
        numbers = readFile();
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return Sum() / numbers.size();

        }
    }

    private double Sum() {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public void writeFile(int amount) {
        DataOutputStream outputFile = null;
        try {
            outputFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            writeNumbers(generateNumbers(amount), outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Не могу открыть файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            if (outputFile != null) {
                try {
                    outputFile.close();
                } catch (IOException e) {
                    System.out.println("Не могу закрыть файл");
                }
            }
        }
    }

    public List<Integer> readFile() {
        List<Integer> numbers = new ArrayList();
        DataInputStream read = null;
        try {
            read = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            readNumbers(read, numbers);
        } catch (FileNotFoundException e) {
            System.out.println("Не могу открыть файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    System.out.println("Не могу закрыть файл");
                }
            }
        }
        return numbers;
    }

    private void writeNumbers(List<Integer> numbers, DataOutputStream outputFile) throws IOException {
        for (int i = 0; i < numbers.size(); i++) {
            outputFile.writeInt(numbers.get(i));
        }
    }

    private void readNumbers(DataInputStream read, List<Integer> numbers) throws IOException {
        while (true) {
            try {
                numbers.add(read.readInt());
            } catch (EOFException e) {
                break;
            }
        }
    }
}