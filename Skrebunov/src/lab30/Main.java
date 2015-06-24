package lab30;

import java.io.IOException;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Read text = new Read();
        StringBuilder str = text.readText();
        String normalText = str.toString();
        System.out.println(text.calcWords(normalText));
        System.out.println(text.calcPunctuations(normalText));
    }
}
