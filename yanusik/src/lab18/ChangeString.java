package lab18;

/**
 * Имеется строка с текстом.Вывести текст, составленный из последни букв всех слов
 */
public class ChangeString {

    public void newString(String newString) {
        char symbol;
        for (int i = 0; i < newString.length(); i++) {
            symbol = newString.charAt(i);
            if (symbol == ' ' || symbol == '\0') {
                System.out.print(newString.charAt(i - 1));
            }
        }
        System.out.println(newString.charAt(newString.length() - 1));
    }
}
