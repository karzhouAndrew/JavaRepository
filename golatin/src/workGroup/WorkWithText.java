package workGroup;

/**
 * Created by NotePad on 07.05.2015.
 */
public final class WorkWithText {
    private final static String PUNCTUATION_MARKS = ".,:;\"?!()-'";

    public static int countOfPunctuationMarks(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (PUNCTUATION_MARKS.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countOfWords(String text) {
        text = text.trim();

        char a = text.charAt(0);
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && a != ' ') {
                count++;
            }
            a = text.charAt(i);
        }

        return count;
    }

    public static String getLastChars(String text) {
        text = text.trim();

        String result = "";
        char a = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (PUNCTUATION_MARKS.indexOf(text.charAt(i)) != -1) {
                continue;
            }
            if (text.charAt(i) == ' ' && a != ' ') {
                result += a;
            }
            a = text.charAt(i);
        }
        return result + a;

    }
}
