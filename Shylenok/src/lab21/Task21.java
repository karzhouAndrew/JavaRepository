package lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 12.06.2015.
 * Написать программу, выполняющую поиск в строке всех тегов абза-цев, в т.ч. тех, у которых есть параметры,
 * например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */

public class Task21 {
    public static void main(String[] args) {
        String str = "0x7FFF fdggfd <p grt=546> dfgdggdg 0x8AAF <p id=\\\"sdd\\\">  kkkk   0xaa865c1";
        Pattern pat = Pattern.compile("<p.+?>");
        Matcher mat = pat.matcher(str);
        System.out.println("Начальная последовательность - " + str);
        str = mat.replaceAll("<p>");
        System.out.println("Конечная последовательность - " + str);
    }
}
