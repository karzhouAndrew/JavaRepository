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
    private static final String NUMBER_REGEX = "\\d+";
    private File path;
    private Random rand = new Random();
    private StringBuilder text;

    public RandomNumbersInFile() {
        this("./Boris/src/file", "test.txt");
    }

    public RandomNumbersInFile(String path, String name) {
        this.path = new File(path + "\\" + name);
        isExistFile();
    }

    private void isExistFile() {
        if (!this.path.exists()) {
            createFile();
        }
    }

    private void createFile() {
        this.path.getParentFile().mkdirs();
        try {
            this.path.createNewFile();
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
            writer.print(getRandomNumber());
            writer.append("\n");
        }
    }

    private int getRandomNumber() {
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
            Sort(numbers);
        }
    }

    private void Sort(List<Integer> numbers) {
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

    public void deleteFile() {
        if (path.exists()) {
            path.delete();
        }
    }

}
