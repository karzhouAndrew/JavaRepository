package lab18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 14.05.2015.
 * Задание 18
 * Имеется строка с текстом. Вывести текст, составленный из послед-них букв всех слов.
 */
public class Task18 {
    public static void main(String[] args) {
        String str = "The. test line! for skills, training programming, ";
        str = str.replaceAll("!+", " ");
        str = str.replaceAll(",+", " ");
        //str = str.replaceAll(".+", " "); // Вопрос почему не заменяет точки???
        Pattern pattern = Pattern.compile("[a-z] +");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int i = matcher.start();
            System.out.print(str.charAt(i));
        }
    }
}
