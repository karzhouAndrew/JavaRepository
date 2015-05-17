package addLab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {
    public int findConsonantAmount(String str) {
        Pattern pattern = Pattern.compile("[б-джзй-нп-тф-щБ-ДЖЗЙ-НП-ТФ-Щ]");
        Matcher matcher = pattern.matcher(str);
        int amount = 0;
        while (matcher.find()) {
            amount++;
        }
        return amount;
    }

    public int findVowelAmount(String str) {
        Pattern pattern = Pattern.compile("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");
        Matcher matcher = pattern.matcher(str);
        int amount = 0;
        while (matcher.find()) {
            amount++;
        }
        return amount;
    }

    public String[] devideIntoSentences(String str) {
        Pattern pattern = Pattern.compile("[А-Я][а-я0-9,\\s]+[.!?]");
        Matcher matcher = pattern.matcher(str);
        String[] sentences = new String[1];
        while (matcher.find()) {
            if (sentences[0] == null) {
                sentences[0] = matcher.group();
            } else {
                sentences = addElement(sentences, matcher.group());
            }
        }
        return sentences;
    }

    public void printSentences(String str) {
        String[] newText = devideIntoSentences(str);
        for (String s : newText) {
            System.out.println(s);
            System.out.println("Длина предложения - " + s.length());
        }
    }

    public String[] addElement(String[] oldString, String element) {
        String[] newString = new String[oldString.length + 1];
        System.arraycopy(oldString, 0, newString, 0, oldString.length);
        newString[oldString.length] = element;
        return newString;
    }

    public int findSpaceAmount(String str) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(str);
        int amount = 0;
        while (matcher.find()) {
            amount++;
        }
        return amount;
    }

    public int findIndentAmount(String str) {
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(str);
        int amount = 0;
        while (matcher.find()) {
            amount++;
        }
        return amount;
    }

    public String textWithoutSpaces(String str) {
        return str.replace(" ", "");
    }
}
