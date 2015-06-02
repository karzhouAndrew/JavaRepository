package addit_brackets;

/* Проверить на валидность массив символов по части равенства открывающих-закрывающих круглых скобок.
   В случае валидности определить количество пар круглых скобок */
public class BracketsValidation {
    public static void main(String[] args) {
        String bracketsTest = "(тестовый) пример строки для проверки (на валидность) открывающих \"(\" и закрывающих \")\" круглых скобок";
        boolean rightBracketValid = true;
        int bracketsStatus = 0;
        int bracketsQuantity = 0;
        for (int i = 0; i < bracketsTest.length(); i++) {
            if (bracketsTest.charAt(i) == '(') {
                bracketsStatus++;
                bracketsQuantity++;
            }
            if (bracketsTest.charAt(i) == ')') {
                bracketsStatus--;
                if (bracketsStatus < 0) {
                    rightBracketValid = false;
                    System.out.print("Строка {\n" + bracketsTest + "\n} не валидна: лишняя закрывающая скобка имеет позицию № " + (i + 1) + " (или раньше)");
                    break;
                }
            }
        }
        if (rightBracketValid) {
            if (bracketsStatus != 0) {
                System.out.println("Строка {\n" + bracketsTest + "\n} не валидна: не хватает закрывающ(их/ей) скоб(ок/ки)");
            } else {
                System.out.println("Строка {\n" + bracketsTest + "\n} валидна по части равенства открывающих-закрывающих круглых скобок");
                System.out.println("Количество пар круглых скобок: " + bracketsQuantity);
            }
        }
    }
}