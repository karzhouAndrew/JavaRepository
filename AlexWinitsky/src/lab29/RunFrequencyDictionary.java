package lab29;

import java.util.Map;

/**
 * Задание 29
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class RunFrequencyDictionary {
    public static void main(String[] args) {
        String str = "Мама   мыла раму мама мыла мама мама. Шла Саша  по шоссе. На горе трава на траве дрова.";
        FrequencyDictionary dictionary = new FrequencyDictionary();
        Map<String, Integer> frequenceDictionary = dictionary.createFrequencyDictionary(str);
        dictionary.printFrequencyDictionary(frequenceDictionary);
        System.out.println("Частотный славарь с сортировкой по возрастанию");
        dictionary.sortFrequencyDictionary(frequenceDictionary);

    }
}
