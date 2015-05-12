package lab4;

/**
 * Created by dmitry on 12.5.15.
 */

public class Hole {
    public static void main(String[] args) {
        int width = 4;
        int length = 5;
        int radius = 6;
        int diamVKvadr;
        diamVKvadr = (int) Math.pow(width, width) + (int) Math.pow(length, length);
        if (diamVKvadr <= (radius * 2 * 2 * radius)) {
            System.out.printf("zakroet");
        } else {
            System.out.printf("ne zakroet");
        }
    }
}
