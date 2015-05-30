package add7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scan {
    public static int numberConsonant(String str) {
        int countConsonant = 0;
        char[] consonant = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩЪЬбвгджзйклмнпрстфхцчшщьъ".toCharArray();
        char[] suppose = str.toCharArray();
        for (int i = 0; i < suppose.length; ++i) {
            for (int j = 0; j < consonant.length; j++) {
                if (suppose[i] == consonant[j]) {
                    countConsonant++;
                }
            }
        }
        return countConsonant;
    }

    public static int numberVowel(String str) {
        int countVowel = 0;
        char[] vowel = "АЕЁИОУЫЭЮЯаеёиоуыэюя".toCharArray();
        char[] suppose = str.toCharArray();
        for (int i = 0; i < suppose.length; ++i) {
            for (int j = 0; j < vowel.length; j++) {
                if (suppose[i] == vowel[j]) {
                    countVowel++;
                }
            }
        }
        return countVowel;
    }

    public void separateSentence(String str) {
        Pattern pattern = Pattern.compile("[А-Я][^!?.]+[!?.]+");
        Matcher matcher = pattern.matcher(str);
        StringBuilder newProffer = new StringBuilder();
        while (matcher.find()) {
            newProffer.append(matcher.group());
            newProffer.append(" Символов: ");
            newProffer.append(matcher.end() - matcher.start());
            newProffer.append("\n");
        }
        System.out.println(newProffer);
    }

    public int numberSpace(String str) {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(str);
        int numberSpace = 0;
        while (matcher.find()) {
            numberSpace++;
        }
        return numberSpace;
    }

    public int numberParagraph(String str) {
        Pattern pattern = Pattern.compile("\\n+");
        Matcher matcher = pattern.matcher(str);
        int numberParagraph = 0;
        while (matcher.find()) {
            numberParagraph++;
        }
        return numberParagraph;
    }

    public void deleteSpace(String str) {
        System.out.println(str.replaceAll(" +", ""));
    }
}

