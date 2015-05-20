package classWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Вывести все предложения заданного текста в порядке
//возрастания количества слов в каждом из них

public class TextSplitter {
    public int countSentences(StringBuilder stringBuilder) {
        Pattern pattern = Pattern.compile("[.!?]");
        Matcher matcher = pattern.matcher(stringBuilder);
        int counterSentences = 0;
        int currentPosition = 0;
        while (matcher.find(currentPosition)) {
            counterSentences++;
            currentPosition = matcher.end();
        }
        return counterSentences;
    }

    public void obtainSentence(StringBuilder stringBuilder, StringBuilder subStringBuilder, int index) {
        Pattern pattern = Pattern.compile("[.!?]");
        Matcher matcher = pattern.matcher(stringBuilder);
        int currentPosition = 0;
        int iterator = 0;
        while (matcher.find(currentPosition)) {
            if (index == iterator) {
                subStringBuilder.append(stringBuilder.substring(currentPosition, matcher.end()));
                while (subStringBuilder.charAt(0) == ' ') {
                    subStringBuilder.deleteCharAt(0);
                }
            }
            iterator++;
            currentPosition = matcher.end();
        }
    }

    public int countWords(StringBuilder sentence) {
        int counterWords = 0;
        int currentPosition = 0;
        Pattern pattern = Pattern.compile("[ ]+");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find(currentPosition)) {
            counterWords++;
            currentPosition = matcher.end();
        }
        return counterWords+1;
    }
}