
package lab17;

public class Lab17 {
    public int countWords(String str) {
        int count = 1;
        String strNoSpace = str.trim();
        if (strNoSpace.length() > 0) {
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}