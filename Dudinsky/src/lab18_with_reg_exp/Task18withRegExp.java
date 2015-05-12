package lab18_with_reg_exp;

/* Задание 18. Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов. */
public class Task18withRegExp {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        String givenStr = " Строка  ,-  with punctuation marks  и лишними пробелами   ,!;.  с обеих сторон этих знаков  .  ";
        System.out.println("В строке {\n" + givenStr + "\n} последними буквами слов являются: " + textProcessor.catchLastLetters(givenStr));
    }
}