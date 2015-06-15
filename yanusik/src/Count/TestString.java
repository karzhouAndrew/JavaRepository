package Count;

/**
 * Created by dmitry on 7.6.15.
 */
public class TestString {
    public static void main(String[] args) {
        CountPunctuation string = new CountPunctuation();
        String str = " Ниже не приводятся общеизвестные и очевидные сочетания вроде Ctr+C, " +
                "Ctr+V или Ctr + S. В IntelliJ IDEA многие хоткеи имеют парный хоткей отличающийся" +
                " только тем, что в нем дополнительно участвует клавиша Shift. ";
        System.out.println("number of punctuation = " + string.countPun(str));

    }
}
