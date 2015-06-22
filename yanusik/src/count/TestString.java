package count;

/**
 * Найти в строке не только запятые, но и другие знаки
 * препинания.
 * Подсчитать общее их количество
 */
public class TestString {
    public static void main(String[] args) {
        CountPunctuation string = new CountPunctuation();
        String str = " Ниже не приводятся общеизвестные и очевидные сочетания вроде Ctr+C, " +
                "Ctr+V или Ctr + S. В IntelliJ IDEA многие хоткеи имеют парный хоткей отличающийся" +
                " только тем, что в нем дополнительно участвует клавиша Shift. ";
        System.out.println("number of punctuation = " + string.countPunct(str));

    }
}
