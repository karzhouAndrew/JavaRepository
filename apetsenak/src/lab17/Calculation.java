package lab17;

public class Calculation {
    public int calculationNumberOfWords(String str) {
        int wordsNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',')) {
                if (str.charAt(i - 1) != ' ' && str.charAt(i - 1) != '.' && str.charAt(i - 1) != ',') {
                    wordsNumber++;
                }
            } else if (i + 1 == str.length()) {
                wordsNumber++;
            }
        }
        return wordsNumber;
    }
}
