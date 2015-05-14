package dopLab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DopLab7 {
    public int numberVowels(String str) {
        Pattern pattern = Pattern.compile("[аоиеёэыуюяАОИЕЁЭЫУЮЯ]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }


    public int numberConsonants(String str) {
        Pattern pattern = Pattern.compile("[бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public void numberSentences(String str) {
        Pattern pattern = Pattern.compile("([А-ЯA-Z](|[^?!.\\(]|\\([^\\)]*\\))*[.?!])");
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while (matcher.find()) {
            String sentence = matcher.group();
            System.out.println("Предложение" + count + ". Длина: " + sentence.length() + " - " + sentence);
            count++;
        }
    }

    public int numberSpaces(String str) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public int numberParagraphs(String str) {
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public String withoutSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}
