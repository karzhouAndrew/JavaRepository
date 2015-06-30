package lab18;


public class LastLetters {
    public void lastLetterToWord(String text) {
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol != ' ' && symbol != '?' && symbol != '!' && symbol != ',' && symbol != '.') {
                if (text.charAt(i + 1) == ' ' || text.charAt(i + 1) == '?' || text.charAt(i + 1) == '!' || text.charAt(i + 1) == ',' || text.charAt(i + 1) == '.') {
                    System.out.print(symbol);
                }
            }
        }
    }
}
