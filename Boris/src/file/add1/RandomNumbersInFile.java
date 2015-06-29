package file.add1;

//Создать и заполнить файл случайными целыми числами.
// Отсортировать содержимое файла по возрастанию.


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RandomNumbersInFile {
    private static final String NUMBER_REGEX = "-?\\d+";
    private File path;
    private static Random rand = new Random();
    private StringBuilder text;

    public RandomNumbersInFile() {
        this("./Boris/src/file", "test.txt");
    }

    public RandomNumbersInFile(String path, String name) {
        this.path = new File(path + "\\" + name);
        createFile();
    }

    private void createFile() {
        if (path.exists()) {
            System.out.println("Exception. File exists.");
        } else {
            path.getParentFile().mkdirs();
            create();
        }
    }

    private void create() {
        try {
            path.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created.");
        }
    }

    public void writeRandomNumberToFile(int quantity) {
        try (PrintWriter writer = new PrintWriter(path)) {
            addNumbersToFile(writer, quantity);
        } catch (IOException e) {
            System.out.println("File not written.");
        }
    }

    private void addNumbersToFile(PrintWriter writer, int quantity) throws IOException {
        for (int i = 0; i < quantity; i++) {
            writer.print(generateRandomNumber());
            writer.append("\n");
        }
    }

    private int generateRandomNumber() {
        return rand.nextInt(100);
    }

    public List<Integer> getSortNumbers() {
        getBuffTextFromFile();
        Matcher matcher = Pattern.compile(NUMBER_REGEX).matcher(text);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            isEmpty(Integer.valueOf(matcher.group()), numbers);
        }

        return numbers;
    }

    private void isEmpty(Integer number, List<Integer> numbers) {
        numbers.add(number);
        if (numbers.size() > 1) {
            sort(numbers);
        }
    }

    private void sort(List<Integer> numbers) {
        int nextIndex = numbers.size() - 1;
        int insertInteger = numbers.get(nextIndex);
        int deflectionsInteger;
        while (nextIndex > 0 && (deflectionsInteger = numbers.get(nextIndex - 1)) > insertInteger) {
            numbers.set(nextIndex, deflectionsInteger);
            nextIndex--;
        }
        numbers.set(nextIndex, insertInteger);
    }

    private void getBuffTextFromFile() {
        text = new StringBuilder();
        try (BufferedReader bufRead = new BufferedReader(new FileReader(path))) {
            addText(bufRead);
        } catch (FileNotFoundException h) {
            System.out.println("Exception file not found.");
        } catch (IOException e) {
            System.out.println("Exception opened file.");
        }
    }

    private void addText(BufferedReader bufRead) throws IOException {
        String str;
        while ((str = bufRead.readLine()) != null) {
            text.append(str).append("\n");
        }
    }

    public void deleteFile(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public File getPath() {
        return path;
    }
}
