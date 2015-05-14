package labBrackets;

/**
 * Проверить строку на правильность расстановки скобок.
 */
public class Task {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a', '(', ')', 'a', '(', '(', 'a', '(', ')', 'a', ')', ')', '(', '('};
        int isStrValid = 0;
        for (int i = 0; i < charArray.length && isStrValid >= 0; i++) {
            if (charArray[i] == '(') {
                isStrValid++;
            } else if (charArray[i] == ')') {
                isStrValid--;
            }
        }
        if (isStrValid == 0) {
            System.out.println("String is valid.");
        } else {
            System.out.println("String is invalid.");
        }
    }
}
