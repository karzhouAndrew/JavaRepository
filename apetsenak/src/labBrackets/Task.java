package labBrackets;

/**
 * Проверить строку на правильность расстановки скобок.
 */
public class Task {
    public static void main(String[] args) {
        char[] str = new char[]{'a', ')', ')', 'a', '(', '(', 'a', '(', ')', 'a', ')', ')', '(', ')'};
        int isStrValid = 0;
        for (int i = 0; i < str.length && isStrValid >= 0; i++) {
            if (str[i] == '(') {
                isStrValid++;
            } else if (str[i] == ')') {
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
