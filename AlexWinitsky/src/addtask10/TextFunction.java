package addtask10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 7.Взять любой русскоязычный̆ текст, в котором не меньше трёхсот знаков.
 * Необходимо провести анализ этого текста на:
 * a)	   Количество согласных и гласных букв.
 * b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.
 * c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).
 * d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.
 */
public class TextFunction {

    public int calculateVowelNumbers(String text) {
        Pattern vowelLetter = Pattern.compile("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");
        Matcher matcherVowel = vowelLetter.matcher(text);

        int numberVowel = 0;
        while (matcherVowel.find()) {
            numberVowel++;
        }
        return numberVowel;
    }

    public int calculateConsonantsNumbers(String text) {
        Pattern consonants = Pattern.compile("[^аеёиоуыэюя]");
        Matcher matcherConsonants = consonants.matcher(text);
        int numberConsonants = 0;
        while (matcherConsonants.find()) {
            numberConsonants++;
        }
        return numberConsonants;
    }

    public int calculateGapNumbers(String text) {
        Pattern patternGap = Pattern.compile("[\\s]");
        Matcher matcherGap = patternGap.matcher(text);
        int numberGap = 0;
        while (matcherGap.find()) {
            numberGap++;
        }
        return numberGap;
    }

    public StringBuilder printSentence(String text) {
        StringBuilder newText = new StringBuilder();
        String array[] = (text.replaceAll("\\n+", "")).split("\\.+");
        for (int i = 0; i < array.length; i++) {
            newText.append(array[i].trim() + "." + " - Количество символов " + array[i].length() + "\n");
        }
        return newText;
    }

    public String printTextWithoutGap(String text) {
        return text.replaceAll(" +", "");
    }

}
