package lab18;

/**
 * Имеется строка с текстом. Вывести текст, составленный из послед-них букв всех слов.
 */
public class Lab18Main {
    public static void main(String[] args) {
        Lab18 lab = new Lab18();
        String text = "  Тестовая строка с несколькими запятыми или не только запятыми даже точкой ";
        System.out.println(lab.lastLetter(text));

    }
}
