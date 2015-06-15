package lab29;

/* Задание 29. Имеется текст. Следует составить для него частотный словарь.

УТОЧНЯЮ ЗАДАНИЕ:
1) программа НЕ СОЗДАЕТ ВРЕМЕННОГО МАССИВА для всех слов заданного текста;
2) при подсчете слов ИГНОРИРУЕТ РЕГИСТРОВЫЕ ОТЛИЧИЯ (оформляет результаты в нижнем регистре);
3) формирует, хранит и оформляет частотный словарь в АЛФАВИТНОМ порядке (словарь все же) */

import java.util.Map;

public class Task29 {
    public static void main(String[] args) {

        String givenText = "Текст текст ТЕКСТ, со знаками препинания  и лишними пробелами   ,!;.  с обеих сторон этих знаков препинания  .  Текст со знаками препинания. 123/ 1) English words also.";

        System.out.println("Исходный текст:\n" + givenText);
        TextProcessor textProcessor = new TextProcessor();
        Map<String, Integer> wordFrequencyMap = textProcessor.getWordFrequencyMapIgnoreCase(givenText);
        System.out.println("Полученный частотный словарь (в алфавитном порядке):\n" + wordFrequencyMap);
    }
}
