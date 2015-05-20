package lab18rev2;

// String with the last letter of a words

public class Lab18Rev2 {
    public static void main(String[] args) {
        String testString = "   thE StrinG! clasS.. representS,,, characteRdsds      ,,, ";
        testString = getClearSentence(testString);
        System.out.println(getWordLastLetters(testString));
    }

    private static String getClearSentence(String str) {
        str = str.trim();
        return str.replaceAll("\\p{Punct}", "");
    }

    private static StringBuilder getWordLastLetters(String str) {
        StringBuilder lastLetters = new StringBuilder();
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ') {
                lastLetters.append(str.charAt(i - 1));
            }
        }
        return lastLetters;
    }
}
