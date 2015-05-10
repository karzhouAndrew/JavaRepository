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
    private final static Pattern patternConsonant = Pattern.compile("[(а-яА-Я)&&[^аАяЯиИеЕюЮуУэЭоОёЁыЫ]]");
    private final static Pattern patternVowel = Pattern.compile("[аАяЯиИеЕюЮуУэЭоОёЁыЫ]");
    private final static Pattern patternSentence = Pattern.compile("[А-Я][^.!?]+[.!?]+");

    public TextAnalysis(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int QuantityConsonant() {
        Matcher matcher = patternConsonant.matcher(str);
        return QuantityLoop(matcher);
    }

    public int QuantityVowel() {
        Matcher matcher = patternVowel.matcher(str);
        return QuantityLoop(matcher);
    }

    private int QuantityLoop(Matcher matcher) {
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    public void SeparateSentence() {
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

    public void TextWithoutSpace() {
        System.out.println(str.replaceAll("\\p{Blank}", ""));
    }

    public int QuantitySpace() {
        Pattern pattern = Pattern.compile("\\p{Blank}");
        Matcher matcher = pattern.matcher(str);
        return QuantityLoop(matcher);
    }

    public int QuantityIndent() {
        Pattern pattern = Pattern.compile("\\n+");
        Matcher matcher = pattern.matcher(str);
        return str.length() != 0 ? QuantityLoop(matcher) + 1 : 0;
    }
}
