package lab17;

/* Задание 17. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать. */
public class Task17 {
    public static void main(String[] args) {
        WordCounters wordCounter = new WordCounters();
        String givenStr = " Строка  ,-   со знаками пунктуации и лишними пробелами   ,!;.  с обеих сторон этих знаков  .  ";
        System.out.println("В строке {\n" + givenStr + "\n} найдено " + wordCounter.calculateWords(givenStr) + " слов(о/а)");
    }
}