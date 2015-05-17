package lab16;

/**
 * Задание 16
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class FindPunctuation {
    public int find(String str) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '-' || symbol == '.' || symbol == '-') {
                number++;
            }
        }
        return number;
    }


}
