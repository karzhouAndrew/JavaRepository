package lab18;

/**
 * Задание 18
 * Имеется строка с текстом. Вывести текст, составленный из послед-них букв всех слов.
 */
public class TextFromLastLetters {
    public static void main(String[] args) {
        String str = "Найти в строке не только    запятые,, но  и другие знаки: препинания.";
        LastLetters newStr = new LastLetters();

        System.out.println("Исходный текст");
        System.out.println(str);
        System.out.println("Текст,составленный из последних букв всех слов: " + newStr.findLastLetters(str));

    }
}
