package extraLab07;

// 1. The number of consonants and vowels.
//

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraLab07 {
    public static void main(String[] args) {
        String text = "В один прекрасный день заказчику потребовалось выяснить, какие классы использует его приложение. " +
                "Приложение было уже хорошо знакомо автору и представляло собой гремучую смесь из кода различной расовой принадлежности, реализующего (к чести разработчиков системы, по большей части грамотно и к месту) механизмы наследования, позднего связывания и динамической компиляции. " +
                "Поэтому информация о действительно используемых классах могла существенно помочь в рефакторинге приложения.\n" +
                "Задача поставлена следующим образом: в процессе работы приложения должен формироваться файл, содержащий имена всех классов, непосредственно использованных приложением." +
                "\rОно, к слову, состоит из двух основных частей: сервера приложений, на котором размещен веб-интерфейс приложения, и сервера обработки (отдельный сервер, на котором различные периодические задачи запускаются с помощью скриптов Ant). " +
                "Разумеется, информацию о классах необходимо собирать с обеих частей приложения.\n" +
                "Приступим к поиску решения поставленной задачи и заодно разберемся с механизмами загрузки классов в Java.";
        String text2 = "В один прекрасный день заказчику потребовалось выяснить, какие классы испол";
        System.out.println("Количество гласных = " + getNumVowels(text2));
        System.out.println("Количество согласных = " + getNumConsonants(text2));

    }
    private static String getSentence(String str) {
        return "";
    }

    private static int getNumConsonants(String str) {
        Pattern pattern = Pattern.compile("[бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static int getNumVowels(String str) {
        Pattern pattern = Pattern.compile("[аоуыэеёюяиАОУЫЭЕЁЮЯИ]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
