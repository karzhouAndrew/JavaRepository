package lab30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by PC on 24.06.2015.
 */
public class Read {
    private final String WORDS = "[\\p{Punct}\\s]+";
    private final String PUNCTUATION = "[А-Яа-яA-Za-z0-9\\s]+";


    public StringBuilder readText() throws IOException {
        StringBuilder text = new StringBuilder();
        BufferedReader file = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\Skrebunov\\src\\lab30\\text.txt"));
            String str = bufferedReader.readLine();
            while (str != null) {
                text.append(str);
                str = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return text;
    }

    public int calcWords(String str) {
        return str.split(WORDS).length;
    }

    public int calcPunctuations(String str) {
        return str.split(PUNCTUATION).length;
    }
}
