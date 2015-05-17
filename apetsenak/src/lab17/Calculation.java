package lab17;

public class Calculation {
    public int calculationNumberOfWords(String str) {
        int numberOfWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',')) {
                if (str.charAt(i - 1) != ' ' && str.charAt(i - 1) != '.' && str.charAt(i - 1) != ',') {
                    numberOfWords++;
                }
            } else if (i + 1 == str.length()) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }
}
