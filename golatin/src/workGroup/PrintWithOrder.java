package workGroup;
/*
Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
*/

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by User on 12.05.2015.
 */
public class PrintWithOrder {
    private static String[] sequence;

    public static void printTextByOrder(String text) {

        Pattern pattern = Pattern.compile("[!?.]");
        sequence = pattern.split(text);
        System.out.println(Arrays.toString(sequence));
        int countWords[] = new int[sequence.length];
        for (int i = 0; i < countWords.length; i++) {
            countWords[i] = getCountWords(sequence[i]);
        }
        System.out.println(Arrays.toString(countWords));
        Arrays.sort(countWords);
        System.out.println(Arrays.toString(countWords));


    }

    private static int getCountWords(String text) {
        text = text.toLowerCase();
        text = text.trim();
        Pattern pattern = Pattern.compile("[ ]");
        return pattern.split(text).length;
    }

    public static void main(String[] args) {
        String string = "Суть алгоритма такова. Если пройдёмся по любому массиву установив правильный порядок в каждой паре соседних элементов, то после того прохода на последнем месте массива гарантированно будет стоять нужный элемент (самый большой для сортировки по возрастанию или самый маленький для сортировки по убыванию). Если ещё раз пройтись по массиву с такими же преобразованиями, то и на предпоследнем месте гарантированно окажется нужный элемент. И так далее.";
        printTextByOrder(string);
    }

}
