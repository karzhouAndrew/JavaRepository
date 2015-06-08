package filePractice01;

// Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.

import java.io.*;
import java.util.*;

public class FileManager {
    private static final String FILE_PATH = "./BatiushkovNikita/src/filePractice01/Dir/IntegerFile.txt";
    private final static StringBuilder text = new StringBuilder();

    public static void main(String[] args) {
        IntegerFile integerFile = new IntegerFile();
        readFile();
        List<Integer> list = parseText(text.toString());
        writeFile(FILE_PATH, sortIntegers(list));
    }

    private static void writeFile(String filePath, List<Integer> values) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))) {
            for (int i = 0; i < values.size(); i++) {
                dataOutputStream.writeBytes(String.valueOf(values.get(i)));
                dataOutputStream.writeBytes(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot write in file.");
        }
    }

    private static List<Integer> sortIntegers(List<Integer> values) {
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return values;
    }

    private static void readFile() {
        try (Scanner scanner = new Scanner(new FileReader(FILE_PATH))) {
            while (scanner.hasNext()) {
                createText(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void createText(String str) {
        text.append(str);
        text.append(" ");
    }

    public static List<Integer> parseText(String str) {
        List<Integer> parseValues = new ArrayList<>();
        for (String value : str.split("\\s+")) {
            parseValues.add(Integer.valueOf(value));
        }
        return parseValues;
    }
}