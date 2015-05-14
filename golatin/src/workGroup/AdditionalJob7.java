package workGroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by NotePad on 12.05.2015.
 */
/*Необходимо провести анализ этого текста на:
        a)	   Количество согласных и гласных букв.  
        b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.  
        c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).  
        d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.  */

public class AdditionalJob7 {
    private static int countRussianVowels;
    private static int countRussianNotVowels;
    private static String REGEX_SPLIT_SENTENCES="[.!?]";
    private static String RUSSIAN_VOWELS = "аАеЕиИоОуУыЫэЭюЮяЯёЁ";
    private static String REGEX_SPACES="[ \\n]";

    private static void setterForRussianLiterals(String text) {
        countRussianVowels = countRussianNotVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if (((text.charAt(i) - 'а') * ('я' - text.charAt(i)) > 0) || ((text.charAt(i) - 'А') * ('Я' - text.charAt(i)) > 0)
                    || (text.charAt(i) == 'ё') || (text.charAt(i) == 'Ё')) {
                if (RUSSIAN_VOWELS.indexOf(text.charAt(i)) != -1) {
                    countRussianVowels++;
                    continue;
                }

                countRussianNotVowels++;
            }
        }
    }

    public static int getCountRussianVowels(String text) {
        setterForRussianLiterals(text);
        return countRussianVowels;
    }

    public static int getCountRussianNotVowels(String text) {
        setterForRussianLiterals(text);
        return countRussianNotVowels;
    }

    public static void textToSentence(String text) {
        Pattern pattern = Pattern.compile(REGEX_SPLIT_SENTENCES);
        String[] strings = pattern.split(text.trim());
        for (String st : strings) {
            System.out.println(st.trim() + " " + st.trim().length());
        }
    }

    public static int getCountOfSpaces(String text) {
        Pattern pattern=Pattern.compile(REGEX_SPACES);
        Matcher matcher=pattern.matcher(text);
        int counter=0;
        while (matcher.find()){
            counter++;
        }
        return counter;
    }

    public static String getTextWithoutSpaces(String text){
        return text.replaceAll(REGEX_SPACES,"");
    }
}
