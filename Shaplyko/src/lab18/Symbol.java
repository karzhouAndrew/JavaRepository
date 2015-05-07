package lab18;

/**
 * Created by Константин on 06.05.2015.
 */
public class Symbol {
    public void word(String strEnter) {
        for (int i = 1; i < strEnter.length(); i++) {
            if (strEnter.charAt(i) == ' ' && strEnter.charAt(i - 1) != ' ') {
                System.out.print(strEnter.charAt(i - 1));
            }
        }
    }
}
