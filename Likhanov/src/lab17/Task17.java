package lab17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
  There is a line of text. Count the number of words in the text.
   It is advisable to take into account that the word can be divided by several spaces,
   at the beginning and end of the text can also be spaces, or may be absent.
  */
public class Task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        System.out.println("In sentence: \"" + string + "\" there is/are " + countWords(string) + " word/s.");
    }

    private static int countWords(String str) {
        int number = 1;
        int p = 0;
        str = str.trim();
        str = str.replaceAll(" +", " ");
        while (p != -1) {
            p = (str.indexOf(" ", p));
            if (p != -1) {
                p++;
                number++;
            }
        }
        return number;
    }
}
