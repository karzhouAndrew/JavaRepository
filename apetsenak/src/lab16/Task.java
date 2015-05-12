package lab16;

/**
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */
public class Task {
    public static void main(String[] args) {
        String str = "Текстовая : строка.. с различными,, знаками  препинания?, :найти ;количество!!!";
        int numberOfPunctMarks = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '!' || symbol == ';' || symbol == '?'||symbol == ',' || symbol == '.' || symbol == ':') {
                numberOfPunctMarks++;
            }
        }
        System.out.println(str);
        System.out.println("numberOfPunctMarks = " + numberOfPunctMarks);
    }
}
