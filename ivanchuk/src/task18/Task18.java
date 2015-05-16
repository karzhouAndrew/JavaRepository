package task18;

public class Task18 {
    private static final char[] PUNCTUATION_MARK = {' ', '.', ',', ':', ';', '!', '?', '-'};

    public static StringBuilder lastLettersOfWords(String text) {
        String textWithoutSpace = text.trim();
        StringBuilder lastLetters = new StringBuilder("");
        int lastPositionSearch = 0;
        for (int i = 0; i < textWithoutSpace.length(); i++) {
            for (int j = 0; j < PUNCTUATION_MARK.length; j++) {
                if (textWithoutSpace.charAt(i) == PUNCTUATION_MARK[j]) {
                    if (i - lastPositionSearch > 1) {
                        lastLetters.append(textWithoutSpace.charAt(i - 1));
                    }
                    lastPositionSearch = i;
                    break;
                }
            }
        }
        return lastLetters;
    }
}
