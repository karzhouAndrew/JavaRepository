package lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a program that performs the search in the string of paragraph tags, including those
who have options, such as <p id = "p1">, and replace them with simple paragraph's tags  <p>.
 */
public class Task21 {
    public static void main(String[] args) {
        String givenStr = "<p id = \"p1\"> trgetg 324jkvgtrv <p id = \"p1\"> mfkerfr <p id = p1>";
        System.out.println("The string: \"" + givenStr + "\" was transformed into the: \"" + stringTransformer(givenStr) + "\"");
    }

    private static String stringTransformer(String str) {
        Pattern pattern = Pattern.compile("<p[\\s|\\w|\"|=]+>");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("<p>");
    }
}
