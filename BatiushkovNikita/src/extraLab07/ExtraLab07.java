package extraLab07;

// Manipulating with text

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraLab07 {
    public static void main(String[] args) {
        String text = "Жили-были мужик да баба. Оба были такие ленивые... Так и норовят дело на чужие плечи столкнуть, самим бы только не делать... И дверь-то в избу никогда на крюк не закладывали: утром-де вставай да руки протягивай, да опять крюк скидывай... И так проживем.\n" +
                "Вот раз баба и свари каши. А уж и каша сварилась! Румяна рассыпчата, крупина от крупины так и отваливается.";

        System.out.println("The number of vowels = " + getNumVowels(text));
        System.out.println("The number of consonants = " + getNumConsonants(text));
        System.out.println("The number of spaces = " + getNumSpaces(text));
        System.out.println("The number of paragraphs = " + getNumSubParagraph(text));
        System.out.println();
        getSentenсeSequence(text);
        System.out.println();
        System.out.println("Text without spaces");
        System.out.println(getModifiedText(text));
    }

    private static String getModifiedText(String str) {
        return str.replaceAll("\\s+", "");
    }

    private static int getNumSubParagraph(String str) {
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count + 1;
    }

    private static int getNumSpaces(String str) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static void getSentenсeSequence(String str) {
        Pattern pattern = Pattern.compile("[А-Я].+?[.!?]+");
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while (matcher.find()) {
            String sentence = matcher.group();
            System.out.println("[Sentenсe №" + count + ". Length: " + sentence.length() + "] " + sentence);
            count++;
        }
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