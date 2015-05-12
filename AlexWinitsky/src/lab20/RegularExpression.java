package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 20
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java,
 * с помощью регулярных выражений и вывести их на страницу
 */
public class RegularExpression {
    void findHex(String str) {
        Pattern pattern = Pattern.compile("(0(x|X)[A-Fa-f0-9]*)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        matcher.reset();

        if (!matcher.find()) {
            System.out.println("Встроке нет шестнадцатеричных чисел");
        }
    }

}
