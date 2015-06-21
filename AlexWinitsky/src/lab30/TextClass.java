package lab30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by Master on 06.06.2015.
 */
public class TextClass {
    public StringBuilder readFile() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./AlexWinitsky/src/lab30/Text.txt"))) {
            String str = bufferedReader.readLine();
            while (str != null) {
                text.append(str);
                str = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public int calculateWords(StringBuilder text) {
        String str = text.toString();
        str = str.trim().replaceAll(" +", " ").replaceAll("\\.+", "\\. ");
        String array[] = str.split("( +)|(\\n+)");
        return array.length;
    }

    public int claculatePunctuation(StringBuilder text) {
        String str = text.toString();
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '-' || symbol == '.' || symbol == '-') {
                number++;
            }
        }
        return number;
    }


}
