package workGroup;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by NotePad on 13.05.2015.
 */
/*
2.	Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
*/
public class PrintSequenceUsingOrder {
    private static String REGEX_SPLIT_SEQ = "[?!.]";
    private static String REGEX_SPLIT_WORD = "[ ]+";

    public static void printMaxSequenceFromText(String text) {
        Pattern pattern = Pattern.compile(REGEX_SPLIT_SEQ);
        String[] sequence = pattern.split(text);

        Pair pairs[] = new Pair[sequence.length];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = new Pair(i, getCountOfWords(sequence[i]));
        }
        Arrays.sort(pairs);
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(sequence[pairs[i].getNumber()].trim());
        }
    }

    private static int getCountOfWords(String text) {
        return text.split(REGEX_SPLIT_WORD).length;
    }
}
