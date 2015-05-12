package lab16;

/**
 * * Задание 16
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class TestPunctuation {
    public static void main(String[] args) {
        String str= "Для месяцев и дней недели в классе описаны константы: JANUARY, FEBRUARY, WEDNESDAY, THURSDAY, FRIDAY,  SATURDAY ";
        FindPunctuation punctuation=new FindPunctuation(str);
        System.out.println("Количесвто знаков припинания в строке " +  punctuation.find());
    }
}
