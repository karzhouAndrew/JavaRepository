package filesTask1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class NumbersFile {
    private final String FILE_NAME;
    private List<Integer> numbers;

    public NumbersFile(String fileName) {
        FILE_NAME = fileName;
        numbers = new ArrayList<>(20);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public boolean writeRandomNumbers() {
        FileWriter out = null;
        try {
            out = new FileWriter(FILE_NAME);
            for (int i = 0; i < 20; i++) {
                Integer number = ((int) (Math.random() * 100));
                out.write(number.toString());
                out.write(" ");
            }
        } catch (IOException e) {
            return false;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean read() {
        FileReader in = null;
        try {
            in = new FileReader(FILE_NAME);
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (IOException e) {
            return false;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<Integer> sort() {
        List<Integer> sortNumbers = new ArrayList<>(numbers);
        Collections.sort(sortNumbers);
        return sortNumbers;
    }
}
