package additionalTask7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {
    public int countVowels(String string) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[уеыаоэяию]");
        Matcher matcher = pattern.matcher(string);
        int increment = 0;
        while (matcher.find(increment)) {
            increment = matcher.end();
            counter++;
        }
        return counter;
    }

    public int countConsonants(String string) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[йцкнгшщзхъфвпрлджчсмтьб]");
        Matcher matcher = pattern.matcher(string);
        int increment = 0;
        while (matcher.find(increment)) {
            increment = matcher.end();
            counter++;
        }
        return counter;
    }

    public int countSpaces(String string) {
        int counter = 0;
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(string);
        int increment = 0;
        while (matcher.find(increment)) {
            increment = matcher.end();
            counter++;
        }
        return counter;
    }

    public int countParagraphs(String string) {
        int counter = 0;
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(string);
        int increment = 0;
        while (matcher.find(increment)) {
            increment = matcher.end();
            counter++;
        }
        return counter;
    }

    public void showSentencesWithSymbolCounter(String string) {
        Pattern pattern6 = Pattern.compile("[.?!]");
        Matcher matcher6 = pattern6.matcher(string);

        int currentPosition = 0;
        while (matcher6.find(currentPosition)) {
            System.out.println(string.substring(currentPosition, matcher6.end()) + " " + ((matcher6.end() - currentPosition) - 1));
            currentPosition = matcher6.end();
        }
    }

    public String obtainTextWithoutSpaces(String string) {
        return string.replaceAll(" ", "");
    }
}
