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
    private String str;
    private final Pattern patternConsonant = Pattern.compile("[(а-яА-Я)&&[^аАяЯиИеЕюЮуУэЭоОёЁыЫ]]");
    private final Pattern patternVowel = Pattern.compile("[аАяЯиИеЕюЮуУэЭоОёЁыЫ]");
    private final Pattern patternSentence = Pattern.compile("[А-Я][^\\.!?]+[\\.!?]+");

    TextAnalysis(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int quantityConsonant() {
        Matcher matcher = patternConsonant.matcher(str);
        return quantityLoop(matcher);
    }

    public int quantityVowel() {
        Matcher matcher = patternVowel.matcher(str);
        return quantityLoop(matcher);
    }

    private int quantityLoop(Matcher matcher) {
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    public void separateSentence() {
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

    public void textWithoutSpace() {
        System.out.println(str.replaceAll("\\p{Blank}", ""));
    }

    public int quantitySpace() {
        Pattern pattern = Pattern.compile("\\p{Blank}");
        Matcher matcher = pattern.matcher(str);
        return quantityLoop(matcher);
    }

    public int quantityIndent() {
        Pattern pattern = Pattern.compile("\\n+");
        Matcher matcher = pattern.matcher(str);
        return str.length() != 0 ? quantityLoop(matcher) + 1 : 0;
    }
}
