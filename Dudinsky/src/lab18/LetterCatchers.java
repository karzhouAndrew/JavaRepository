package lab18;

public class LetterCatchers {

    public StringBuilder catchLastLetters(String givenStr) {
        StringBuilder resultStrBuilder = new StringBuilder();
        for (int i = 0; i < givenStr.length(); i++) {
            char currChar = givenStr.charAt(i);
            if (currChar != ' ' && currChar != ',' && currChar != '.' && currChar != ';' && currChar != ':' && currChar != '!' && currChar != '?' && currChar != '-') {
                while (currChar != ' ' && currChar != ',' && currChar != '.' && currChar != ';' && currChar != ':' && currChar != '!' && currChar != '?' && currChar != '-' && i < givenStr.length() - 1) {
                    i++;
                    currChar = givenStr.charAt(i);
                }
                if (i < givenStr.length() - 1) {
                    resultStrBuilder.append(givenStr.charAt(i - 1));
                } else {
                    resultStrBuilder.append(givenStr.charAt(i));
                }
            }
        }
        return resultStrBuilder;
    }
}