package lab31;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextOperations {
    public static String readFile(String fileName) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line = buffer.readLine();

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                line = buffer.readLine();
            }
            return stringBuilder.toString();
        } finally {
            buffer.close();
        }
    }

    public static List<Integer> searchNumbers(String str) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        List<Integer> listNumbers = new ArrayList<Integer>();

        while (matcher.find()) {
            listNumbers.add(Integer.parseInt(matcher.group()));
        }
        return listNumbers;
    }

    public static int calculateNumbers(List<Integer> list) {
        int sumNumbers = 0;
        for (Integer number : list) {
            sumNumbers += number;
        }
        return sumNumbers;
    }


    public static List<Integer> removeDuplicateNumbers(List<Integer> list) {
        List<Integer> uniqueNumbers = new ArrayList<Integer>();
        for (int value : list) {
            if (!uniqueNumbers.contains(value)) {
                uniqueNumbers.add(value);
            }
        }
        return uniqueNumbers;
    }
}
