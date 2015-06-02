package strPractice01;

// Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrPractice01 {
    public static void main(String[] args) {
        //String text = "A1 A2 A3 A1. Жили-были мужик да баба мужик. Оба были такие ленивые... Так и норовят дело на чужие плечи столкнуть, самим бы только не делать... И дверь-то в избу никогда на крюк не закладывали: утром-де вставай да руки протягивай, да опять крюк скидывай... И так проживем. Вот раз баба и свари каши? А уж и каша сварилась! Румяна рассыпчата, крупина жжош от крупины так и отваливается?";
        String text = "A1 A2 A3 A1.";
        System.out.println(getSentenceMaxSameWords(text));
    }

    public static String getSentenceMaxSameWords(String text) {
        int maxCount = 0;
        int count = 0;
        String maxSentence = null;
        String[] sentenceArray = getSentenceArray(text);
        for (String sentence : sentenceArray) {
            String[] wordArray = getWordArray(sentence);
            for (int i = 0; i < wordArray.length - 1; i++) {
                String word = wordArray[i];
                for (int j = 0; j < wordArray.length - 1; j++) {
                    if (word.equals(wordArray[j + 1])) {
                        count++;
                        if (maxCount <= count) {
                            maxCount = count;
                            maxSentence = sentence;
                        }
                    }
                }
            }
        }
        return maxSentence;
    }

    public static String[] getWordArray(String text) {
        return (text.replaceAll("\\p{Punct}", " ")).split("\\s+");
    }


    public static String[] getSentenceArray(String text) {
        return text.split("[.]+\\s+");
    }

    /*    public static List<String> getSentenceList(String text) {
        List<String> sentenceList = new ArrayList<String>();
        Pattern pattern = Pattern.compile("[А-Я].+?[.!?]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentenceList.add(matcher.group());
        }
        return sentenceList;
    }*/
}
