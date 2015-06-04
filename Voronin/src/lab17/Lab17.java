package lab17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab17 {
    public static void main(String[] args) {
        String str = "  Таким образом, функция replaceAll находит фрагмент строки  ";
        int count = 1;
        str = str.trim();
        Pattern pattern = Pattern.compile(" +");
        Matcher matcher = pattern.matcher(str);
        if (str != "") {
            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        } else System.out.println("Строка пустая");
    }
}
