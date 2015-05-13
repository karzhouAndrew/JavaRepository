package lab16;

public class Calculation {
    public int findPunct(String str) {
        int numOfPunct = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '!' || symbol == ';' || symbol == '?' || symbol == ',' || symbol == '.' || symbol == ':') {
                numOfPunct++;
            }
        }
        return numOfPunct;
    }
}
