package lab30;

import java.io.*;

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

    public static int countCommas(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',') {
                counter++;

            }
        }
        return counter;
    }

    public static int countWords(String str) {
        int counter = 1;
        String strNoSpace = str.trim();
        if (strNoSpace.length() > 0) {
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    counter++;
                }
            }
            return counter;
        } else {
            return 0;
        }
    }
}
