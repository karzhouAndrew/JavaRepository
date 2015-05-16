package lab17;

public class WordCounters {
    public int calculateWords(String givenStr) {
        int wordCounter = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            char currChar = givenStr.charAt(i);
            if (currChar != ' ' && currChar != ',' && currChar != '.' && currChar != ';' && currChar != ':' && currChar != '!' && currChar != '?' && currChar != '-') {
                wordCounter++;
                while (givenStr.charAt(i) != ' ' && i < givenStr.length() - 1) {
                    i++;
                }
            }
        }
        return wordCounter;
    }
}