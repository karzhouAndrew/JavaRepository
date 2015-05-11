package lab16;

public class PunctCounters {

    public int calculatePunct(String givenPunctStr) {
        int punctCounter = 0;
        for (int i = 0; i < givenPunctStr.length(); i++) {
            char currChar = givenPunctStr.charAt(i);
            if (currChar == ',' || currChar == '.' || currChar == ':' || currChar == '-' || currChar == '!' || currChar == '?' || currChar == ';') {
                punctCounter++;
            }
        }
        return punctCounter;
    }
}