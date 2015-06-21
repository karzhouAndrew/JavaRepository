package lab32;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FileWork {
    public List<Integer> readFile(String fileName) {
        List<Integer> fileNumbers = new ArrayList<>();
        try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            while (true) {
                try {
                    int number = inputStream.readInt();
                    fileNumbers.add(number);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileNumbers;
    }

    public void writeFile(String fileName) {
        Random random = new Random();
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            for (int i = 0; i < 20; i++) {
                outputStream.writeInt(random.nextInt(19) + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile(String fileName) {
        List<Integer> numbers = readFile(fileName);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public double findAverage(String fileName) {
        List<Integer> numbers = readFile(fileName);
        int divider = 0;
        int sum = 0;
        Iterator<Integer> listIterator = numbers.iterator();
        while (listIterator.hasNext()) {
            sum += listIterator.next();
            divider++;
        }
        return divider == 0 ? 0 : (double) sum / divider;
    }
}
