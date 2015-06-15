package Count;

/**
 * Найти в строке не только запятые, но и другие знаки
 * препинания.
 * Подсчитать общее их количество
 */
public class CountPunctuation {
    public int CountPun(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int symbol = str.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == ';' || symbol == ':'
                    || symbol == '?' || symbol == '!' || symbol == '-') {
                count++;
            }

        }
        return count;
    }
}

