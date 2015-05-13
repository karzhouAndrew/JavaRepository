package lab17_with_reg_exp;

/* Задание 17. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать. */
public class Task17withRegExp {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        String givenStr = " Строка  ,-  with punctuation marks  и лишними пробелами   ,!;.  с обеих сторон этих знаков  .  ";
        System.out.println("В строке {\n" + givenStr + "\n} найдено " + textProcessor.calculateWords(givenStr) + " слов(о/а)");
    }
}