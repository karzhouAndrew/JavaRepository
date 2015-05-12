package lab16;

public class Calculation {
    public int calcOfPunctuationMarks(String str){
        int numberOfPunctuationMarks = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '!' || symbol == ';' || symbol == '?'||symbol == ',' || symbol == '.' || symbol == ':') {
                numberOfPunctuationMarks++;
            }
        }
        return numberOfPunctuationMarks;
    }
}
