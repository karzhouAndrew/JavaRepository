package lab17;

public class Words {
    public int wordsNumber(String text) {
        char symbol;
        int wordsCount = 0;
        int count = 0;
        while (count < text.length()) {
            symbol = text.charAt(count);
            if (symbol != ' ' && symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?') {
                if (count == text.length() - 1) {
                    wordsCount++;
                } else if (text.charAt(count + 1) == ' ' || text.charAt(count + 1) == ',' || text.charAt(count + 1) == '.' || text.charAt(count + 1) == '!' || text.charAt(count + 1) == '?') {
                    wordsCount++;
                }
            }
            count++;
        }
        return wordsCount;
    }
}
