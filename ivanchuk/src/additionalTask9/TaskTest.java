package additionalTask9;

//Заменить в строке все вхождения 'child' на 'children'.
//Удалить из текста все символы, являющиеся цифрами.

public class TaskTest {
    public static void main(String[] args) {
        String text = "I 5656children7 chil9990 7867child67";
        String textEdited = AdditionalTask9.replaceChild(text);
        System.out.println("Отредактированный текст: " + AdditionalTask9.deleteNumbers(textEdited));
    }
}