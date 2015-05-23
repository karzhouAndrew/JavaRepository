package work.laba2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2.	Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
public class SortSentenceRise {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");

    public static String getSentence(String str) {
        StringBuilder sortString = new StringBuilder("");
        String[] arraySentence = str.split("[A-ZА-Я][^.?!]+[.?!]+");
        getArraySentence(str, arraySentence);
        int[] arrayQuantityWord = new int[arraySentence.length];
        loopForArrayInitialize(arraySentence, arrayQuantityWord);
        for (int i = 0; i < arrayQuantityWord.length; i++) {
            putMaxValueLeft(arraySentence, arrayQuantityWord, i);
            sortString.append(arraySentence[i]);
            sortString.append("\n");
        }
        return sortString.toString();
    }

    private static void putMaxValueLeft(String[] arraySentence, int[] arrayQuantityWord, int i) {
        int maxValue = arrayQuantityWord[i];
        int indexMax = i;
        for (int j = i; j < arrayQuantityWord.length; j++) {
            if (maxValue < arrayQuantityWord[j]) {
                indexMax = j;
                maxValue = arrayQuantityWord[indexMax];
            }
        }
        if (i != indexMax) {
            swapArray(arrayQuantityWord, arraySentence, i, indexMax);
        }
    }

    private static void swapArray(int[] arrayInt, String[] arrayString, int first, int second) {
        int tempInt = arrayInt[first];
        arrayInt[first] = arrayInt[second];
        arrayInt[second] = tempInt;
        String tempString = arrayString[first];
        arrayString[first] = arrayString[second];
        arrayString[second] = tempString;
    }

    private static void getArraySentence(String str, String[] arraySentence) {
        Matcher matcher = PATTERN_SENTENCE.matcher(str);
        int index = 0;
        while (matcher.find()) {
            arraySentence[index] = matcher.group();
            index++;
        }
    }

    private static void loopForArrayInitialize(String[] arraySentence, int[] arrayQuantityWord) {
        for (int i = 0; i < arraySentence.length; i++) {
            arrayQuantityWord[i] = SortSentenceRise.getQuantityWord(arraySentence[i]);
        }
    }

    private static int getQuantityWord(String str) {
        String[] arrayWords = str.split("[ \\p{Punct}]+");
        return arrayWords.length;
    }

}
