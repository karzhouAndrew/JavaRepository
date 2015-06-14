package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 30.05.2015.
 Написать программу, выполняющую поиск в строке шестнадцате-ричных чисел, записаных по правилам Java,
 с помощью регулярных выражений и вывести их на страницу.
 */
public class Task20 {
    public static void main(String[] args) {
        String str = "0x7FFF fdggfd dfgdggdg 0x8AAF  kkkk  khg gkhjg 0xaa865c1";
        Pattern patter = Pattern.compile("0x\\p{XDigit}+" );
        Matcher m = patter.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}