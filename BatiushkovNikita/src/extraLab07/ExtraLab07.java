package extraLab07;

// 1. The number of consonants and vowels.
//

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraLab07 {
    public static void main(String[] args) {
        String text = "Жили-были мужик да баба. Оба были такие ленивые... Так и норовят дело на чужие плечи столкнуть, самим бы только не делать... И дверь-то в избу никогда на крюк не закладывали: утром-де вставай да руки протягивай, да опять крюк скидывай... И так проживем.\n" +
                "Вот раз баба и свари каши. А уж и каша сварилась! Румяна рассыпчата, крупина от крупины так и отваливается.";

        System.out.println("The number of vowels = " + getNumVowels(text));
        System.out.println("The number of consonants = " + getNumConsonants(text));
        //getSentenseSequence(getSentenceArr(text));
        getSent(text);
    }

    private static void getSent(String str) {
        Pattern pattern = Pattern.compile("[А-Я(.!)]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    /*
    private static void getSentenseSequence(String[] arrStr) {
        int arrStrLength = arrStr.length;
        for (int i = 0; i < arrStrLength; i++) {
            System.out.println(arrStr[i] + ". [Sentence №" + (i + 1) + ". Length: " + arrStr[i].length() + "]");
        }
    }

    private static String[] getSentenceArr(String str) {
        return str.split("[.]+");
    }
    */
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
