package doplab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextAnalysis {

    public String lettersNumber(String text) {
        Pattern vowelsPattern = Pattern.compile("[ауоыиэяюе]|[АУОЫИЭЯЮЕ]|[aeiouy]|[AEIOUY]");
        Matcher vowelsMatcher = vowelsPattern.matcher(text);
        int vowels = 0;
        while (vowelsMatcher.find()) {
            vowels++;
        }
        vowelsMatcher.reset();
        Pattern consonantsPattern = Pattern.compile("[бвгджзйклмнпрстфхцчшщ]|[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]|[bcdfghjklmnpqrstv]|[BCDFGHJKLMNPQRSTV]");
        Matcher consonantsMatcher = consonantsPattern.matcher(text);
        int consonants = 0;
        while (consonantsMatcher.find()) {
            consonants++;
        }
        return "Гласных " + vowels + " Согласных " + consonants;
    }

    public void symbolsNumberInSentences(String text) {
        Pattern symbolPattern = Pattern.compile("[a-zA-Z\\s\\w\\d\\-\\+,()[а-яА-Я\\s\\w\\d]]+");
        Matcher symbolMatcher = symbolPattern.matcher(text);
        int lettersInSentences = 0;
        while (symbolMatcher.find()) {
            System.out.println(symbolMatcher.group() + ". Количество символов - " + symbolMatcher.group().length());
        }
    }

    public int spacesNumber(String text) {
        Pattern spacesPattern = Pattern.compile("\\s|\n");
        Matcher spacesMatcher = spacesPattern.matcher(text);
        int spacesCount = 0;
        while (spacesMatcher.find()) {
            spacesCount++;
        }
        return spacesCount;
    }

    public String textWithoutSpaces(String text) {
        return text.replaceAll(" +", "");
    }
}
