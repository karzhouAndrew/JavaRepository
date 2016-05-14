package task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Change all words in the line from 'child' to 'children'. Remove from the text all digits.
 */
public class Task08 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the text: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println("The old string: \"" + line + "\"");
        System.out.println("The new one: \"" + stringTransformer(line) + "\"");
    }

    private static String stringTransformer(String line) {
        line = line.replaceAll("\\d", "");
        Pattern pattern = Pattern.compile("child");
        Matcher matcher = pattern.matcher(line);
        return matcher.replaceAll("children");
    }
}
