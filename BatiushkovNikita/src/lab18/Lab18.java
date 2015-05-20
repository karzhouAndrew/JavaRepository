package lab18;

// String with the last letter of a words

public class Lab18 {
    public static void main(String[] args) {
        String testString = "   thE StrinG! clasS.. representS,,, characteRdsds      ,,, ";
        testString = getClearSentence(testString);
        System.out.println(getWordLastLetters(testString) + testString.charAt(testString.length() - 1));
    }

    private static String getClearSentence(String str) {
        str = str.trim();
        return str.replaceAll("\\p{Punct}", "");
    }

    private static String getWordLastLetters(String str) {
        int strLength = str.length();
        String lastLetters = "";
        for (int i = 0; i < strLength; i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ') {
                lastLetters += str.charAt(i - 1);
            }
        }
        return lastLetters;
    }
}