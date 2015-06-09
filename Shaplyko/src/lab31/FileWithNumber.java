package lab31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileWithNumber {
    private final String END_STRING = "\\Z";
    private final String NUMBER = "[0-9]+";
    private String text;
    int sum = 0;
    List<String> number = new ArrayList<String>();

    public void readFile() {
        try {
            Scanner scanner = new Scanner(new File("./src/lab31/fileWithNumber.txt"));
            scanner.useDelimiter(END_STRING);
            text = scanner.next();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Can't find input file!");
        } catch (NoSuchElementException e) {
            System.err.println("Can't read from input file!");
        }
    }

    public List<String> findNumber() {
        Pattern pattern = Pattern.compile(NUMBER);
        Matcher matcher = pattern.matcher((text));
        while (matcher.find()) {
            number.add(text.substring(matcher.start(), matcher.end()));
        }
        return number;
    }


    public Set<String> removeSameNumbers() {
        Set<String> withoutSameNumbers = new HashSet<String>(number);
        return withoutSameNumbers;
    }

    public int amountNumbers() {
        for (int i = 0; i < number.size(); i++) {
            sum += Integer.parseInt(number.get(i));
        }
        return sum;
    }
}
