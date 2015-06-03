package lab18rev2;

// String with the last letter of a words

public class Lab18Rev2 {
    public static void main(String[] args) {
        String testString = "   thE StrinG! clasS.. representS,,, characteRdsds      ,,, ";
        testString = getClearSentence(testString);
        System.out.println(getWordLastLetters(testString));
    }

    private static String getClearSentence(String text) {
        text = text.trim();
        return text.replaceAll("\\p{Punct}", "");
    }

    private static StringBuilder getWordLastLetters(String text) {
        StringBuilder lastLetters = new StringBuilder();
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            char symbol = text.charAt(i);
            if (symbol == ' ') {
                lastLetters.append(text.charAt(i - 1));
            }
        }
        return lastLetters;
    }
}
