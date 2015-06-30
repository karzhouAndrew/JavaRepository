package lab17;

public class Words {
    public int wordsNumber(String text) {
        int wordsCount = 0;
        int count = 0;
        while (count < text.length()) {
            char symbol = text.charAt(count);
            if (symbol != ' ' && symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?') {
                if (text.charAt(count + 1) == ' ' || text.charAt(count + 1) == ',' || text.charAt(count + 1) == '.' || text.charAt(count + 1) == '!' || text.charAt(count + 1) == '?') {
                    wordsCount++;
                }
            }
            count++;
        }
        return wordsCount;
    }
}
