package lab18;

// String with the last letter of a words

public class Lab18 {
    public static void main(String[] args) {
        String testString = " thE StrinG! clasS.. representS,,, characteR ";
        //System.out.println(getWordLastLetters(str));

        //String[] wordArr = getArrOfWords(testString);
        String[] wordArr = getArrOfWords(testString);
        for (int i = 0; i < wordArr.length; i++) {
            System.out.println(getWordLastLetter(wordArr[i]));
        }
    }

    private static String[] getArrOfWords(String str) {

    }


    private static String getWordLastLetter(String str) {
        char symbol = str.charAt(str.length() - 1);
        return String.valueOf(symbol);
    }

    /*
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
    } */
}
