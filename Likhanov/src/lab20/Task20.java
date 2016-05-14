package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Make a program that performs the search inside of the string of hexadecimal numbers
listed in Java rules, using regular expressions and display them.
 */
public class Task20 {
    public static void main(String[] args) {
        String givenStr = "Here is test string0x5f 042715, that contains 9842105 decimal, 032517 octal è 0X52D7A12BE, hexadecimal -0x23ca8; literals and others f8b26cd5  -0X5D.";
        System.out.println("In the string \"" + givenStr + "\" were found hexadecimal numbers: ");
        searchNumbers(givenStr);
    }

    private static void searchNumbers(String str) {
        Pattern pattern = Pattern.compile("-?0x[0-9a-zA-Z]{4,}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
