package doplab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextAnalysis {
    public String numberOfLetters(String text) {
        Pattern patternOfVowels = Pattern.compile("[ауоыиэяюе]|[АУОЫИЭЯЮЕ]|[aeiouy]|[AEIOUY]");
        Matcher matcherOfVowels = patternOfVowels.matcher(text);
        int vowels = 0;
        while (matcherOfVowels.find()) {
            vowels++;
        }
        matcherOfVowels.reset();
        Pattern patternOfConsonants = Pattern.compile("[бвгджзйклмнпрстфхцчшщ]|[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]|[bcdfghjklmnpqrstv]|[BCDFGHJKLMNPQRSTV]");
        Matcher matcherOfConsonants = patternOfConsonants.matcher(text);
        int consonants = 0;
        while (matcherOfConsonants.find()) {
            consonants++;
        }
        return "Гласных " + vowels + " Согласных " + consonants;
    }

    public void numberOfSymbolsInSentences(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z\\s\\w\\d\\-\\+,()[а-яА-Я\\s\\w\\d]]+");
        Matcher matcher = pattern.matcher(text);
        int lettersInSentences = 0;
        while (matcher.find()) {
            System.out.println(matcher.group() + ". Количество символов - " + matcher.group().length());
        }
    }

    public int numberOfSpaces(String text) {
        Pattern pattern = Pattern.compile("\\s|\n");
        Matcher matcher = pattern.matcher(text);
        int numberOfSpaces = 0;
        while (matcher.find()) {
            numberOfSpaces++;
        }
        return numberOfSpaces;
    }

    public String textWithoutSpaces(String text) {
        String textWithoutSpaces = text.replaceAll(" +", "");
        return textWithoutSpaces;
    }
}
