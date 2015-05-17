package laba.add7;

//Взять любой русскоязычный̆ текст, в котором не меньше трёхсот знаков.
//Необходимо провести анализ этого текста на:
//        a)	   Количество согласных и гласных букв.  
//        b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.  
//        c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).  
//        d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalysis {
    private final static Pattern patternConsonant = Pattern.compile("[(а-яА-Я)&&[^аАяЯиИеЕюЮуУэЭоОёЁыЫ]]");
    private final static Pattern patternVowel = Pattern.compile("[аАяЯиИеЕюЮуУэЭоОёЁыЫ]");
    private final static Pattern patternSentence = Pattern.compile("[А-Я][^\\.!?]+[\\.!?]+");

    public static int quantityConsonant(String str) {
        Matcher matcher = patternConsonant.matcher(str);
        return quantityLoop(matcher);
    }

    public static int quantityVowel(String str) {
        Matcher matcher = patternVowel.matcher(str);
        return quantityLoop(matcher);
    }

    private static int quantityLoop(Matcher matcher) {
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    public static void separateSentence(String str) {
        Matcher matcher = patternSentence.matcher(str);
        StringBuilder sentence = new StringBuilder();
        while (matcher.find()) {
            sentence.append(matcher.group());
            sentence.append(" В предложении ");
            sentence.append(matcher.end() - matcher.start());
            sentence.append(" символов.\n");
        }
        System.out.println(sentence.toString());
    }

    public static void textWithoutSpace(String str) {
        System.out.println(str.replaceAll("\\p{Blank}", ""));
    }

    public static int quantitySpace(String str) {
        Pattern pattern = Pattern.compile("\\p{Blank}");
        Matcher matcher = pattern.matcher(str);
        return quantityLoop(matcher);
    }

    public static int quantityIndent(String str) {
        Pattern pattern = Pattern.compile("\\n+");
        Matcher matcher = pattern.matcher(str);
        return str.length() != 0 ? quantityLoop(matcher) + 1 : 0;
    }
}
