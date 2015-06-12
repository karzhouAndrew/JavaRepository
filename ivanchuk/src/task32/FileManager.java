package task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private final String FILE_NAME;
    private List<Integer> numbers;

    public FileManager(String fileName) {
        FILE_NAME = fileName;
        numbers = new ArrayList<>(20);
    }

    public boolean writeRandomNumbers() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt((int) (Math.random() * 100));
            }
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean read() throws IOException {
        DataInputStream in;
        try {
            in = new DataInputStream(new FileInputStream(FILE_NAME));
        } catch (FileNotFoundException e) {
            return false;
        }
        int number = in.readInt();
        while (true) {
            numbers.add(number);
            try {
                number = in.readInt();
            } catch (IOException e) {
                break;
            }
        }
        in.close();
        return true;
    }

    public double calcArithmeticAverage() {
        double result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result / numbers.size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
