package lab18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
There is a line of text. Display text composed of the last word's letters.
 */
public class Task18 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the text: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println("The text: \"" + text + "\" is transformed to: \"" + textTransformer(text) + "\".");
    }

    private static String textTransformer(String txt) {
        String result = "";
        String [] str = txt.split(" +");
        for(int i = 0; i < str.length; i++){
        char[] word = str[i].toCharArray();
            char letter = word[word.length - 1];
            result += letter;
        }
        return result;
    }
}
