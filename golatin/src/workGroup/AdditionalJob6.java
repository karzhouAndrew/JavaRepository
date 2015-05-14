package workGroup;

/**
 * Created by User on 02.05.2015.
 * Корректность ввода скобок
 */
public class AdditionalJob6 {
    public static void main(String[] args) {
        String text = "()()()(()((()()())()(((())))))()()()()((()()()))";
        int countOfBrackets = 0;
        int checkBrackets = 0;
        String result = "\nЧисло закрывающих скобок = Число открывающих скобок. Скобок: ";
        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                countOfBrackets++;
                checkBrackets++;
            } else if (text.charAt(i) == ')') {
                checkBrackets--;
            }
            if (checkBrackets < 0) {
                result = "\nЧисло закрывающих скобок > Число открывающих скобок";
                break;
            }
            System.out.print(text.charAt(i));
        }
        if (checkBrackets > 0) {
            result = "\nЧисло закрывающих скобок < Число открывающих скобок";
        } else if (checkBrackets == 0) {
            result += countOfBrackets;
        }
        System.out.println(result);
    }
}

