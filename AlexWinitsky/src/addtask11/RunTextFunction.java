package addtask11;

/**
 * Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
 */
public class RunTextFunction {
    public static void main(String[] args) {
        String text = "Our child is 5 years. My brothers child is 4 years. My siters children is 7 years. ";
        TextFunction textFunction = new TextFunction();
        System.out.println("Исходное предложение");
        System.out.println(text);
        System.out.println("Удалить из текста все символы, являющиеся цифрами.");
        textFunction.deleteNumbers(text);
        System.out.println("Заменить в строке все вхождения 'child' на 'children'");
        textFunction.findAndReplaceWord(text);
    }
}
