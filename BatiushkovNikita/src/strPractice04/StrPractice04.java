package strPractice04;

// Во всех вопросительных предложениях текста найти и напечатать слова заданной длины

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrPractice04 {
    public static void main(String[] args) {
        String text = "Жили-были мужик да баба. Оба были такие ленивые... Так и норовят дело на чужие плечи столкнуть, самим бы только не делать... И дверь-то в избу никогда на крюк не закладывали: утром-де вставай да руки протягивай, да опять крюк скидывай... И так проживем.\\n\" +\n" +
                "                \"Вот раз баба и свари каши? А уж и каша сварилась! Румяна рассыпчата, крупина жжош от крупины так и отваливается?";
        int wordLength = 4;
        getWorldsPredetermLength(text, wordLength);
    }

    public static void getWorldsPredetermLength(String text, int wordLength) {
        Pattern pattern = Pattern.compile("[А-Я].+?[.!?]+");
        Matcher matcher = pattern.matcher(text);
        String[] sentenceArr;
        while (matcher.find()) {
            String sentence = matcher.group();
            //System.out.println(sentence);
            if (getQuestionSentence(sentence) == true) {
                sentence = getClearSentence(sentence);
                sentenceArr = sentence.split(" +");
                for (String word : sentenceArr) {
                    if (word.length() == wordLength) {
                        System.out.println(word);
                    }
                }
            }

        }
    }

    public static String getClearSentence(String str) {
        return str.replaceAll("[.?!]", "");
    }

    public static boolean getQuestionSentence(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '?') {
                return true;
            }
        }
        return false;
    }
}