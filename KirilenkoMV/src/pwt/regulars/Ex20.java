package pwt.regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kirilenko_MV on 11.05.2015.
 * Поиск в строке шестнадцатиричных чисел.
 */
public class Ex20 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("-?[0-9A-F]+");
        Matcher matcher = pattern.matcher("12lkcvbABhgn32Fgbdfg");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
