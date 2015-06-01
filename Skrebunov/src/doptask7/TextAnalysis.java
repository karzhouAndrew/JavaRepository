package doptask7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalysis {

    public void numberOfLetters(String o) {
        Pattern p = Pattern.compile("[ауоыиэяюе]|[АУОЫИЭЯЮЕ]|[aeiouy]|[AEIOUY]");
        Matcher m = p.matcher(o);
        int vowels = 0;
        while (m.find()) {
            vowels++;
        }
        m.reset();
        Pattern pattern = Pattern.compile("[бвгджзйклмнпрстфхцчшщ]|[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]|[bcdfghjklmnpqrstv]|[BCDFGHJKLMNPQRSTV]");
        Matcher matcher = pattern.matcher(o);
        int consonants = 0;
        while (matcher.find()) {
            consonants++;
        }
        System.out.println("Гласных " + vowels);
        System.out.println("Согласных " + consonants);
    }

    public void sentences(String o) {
        Pattern pattern = Pattern.compile("[a-zA-Z\\s\\w\\d\\-\\+,()[а-яА-Я\\s\\w\\d]]+");
        Matcher matcher = pattern.matcher(o);
        while (matcher.find()) {
            System.out.println(matcher.group() + ". Количество символов - " + matcher.group().length());
        }
    }

    public void numberOfSpaces(String o) {
        Pattern pattern = Pattern.compile("\\s|\n");
        Matcher matcher = pattern.matcher(o);
        int numberOfSpaces = 0;
        while (matcher.find()) {
            numberOfSpaces++;
        }
        System.out.println("Количество пробелов + абзацы = " + numberOfSpaces);
    }

    public void textWithoutSpaces(String o) {
        String t;
        t = o.replaceAll(" +", "");
        System.out.println(t);
    }
}
