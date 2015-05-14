package workGroup;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by NotePad on 14.05.2015.
 */
/*Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.*/
public final class PrintWordWhichNotExists {
    private static String REGEX_SPLIT_SEQ = ".*?[?!.]";
    private static String REGEX_SPLIT_WORD = "[^A-Za-zА-Яа-я0-9ёЁ]+";

    public static void printWord(String text, int numberSequence) {
        Pattern pattern = Pattern.compile(REGEX_SPLIT_SEQ);
        Matcher matcher = pattern.matcher(text);
        do {
            matcher.find();
            numberSequence--;
        }
        while (numberSequence > 0);
        String sequence = text.substring(matcher.start(), matcher.end());
        String textWithoutSequence = text.substring(0, matcher.start()).trim() + text.substring(matcher.end(), text.length()).trim();
        String[] words = sequence.split(REGEX_SPLIT_WORD);

        for (String word : words) {
            if (!checkWordInString(" "+word+" ", textWithoutSequence.replaceAll(REGEX_SPLIT_WORD," "))) {
                System.out.println(word);
            }
        }
    }

    private static boolean checkWordInString(String word, String text) {
        return text.toLowerCase().contains(word);
    }

    private static boolean wordExists(String word, String text) {
        word.toLowerCase();
        text.toLowerCase();
        String[] strings = text.split(REGEX_SPLIT_WORD);
        System.out.println(Arrays.toString(strings));
        return false;
    }
}
