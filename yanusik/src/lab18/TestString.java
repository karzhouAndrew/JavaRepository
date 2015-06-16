package lab18;

/**
 * Имеется строка с текстом.Вывести текст, составленный из последни букв всех слов
 */
public class TestString {
    public static void main(String[] args) {
        ChangeString str = new ChangeString();
        String newStr = "We're not one of those companies";
        str.newString(newStr);
    }
}
