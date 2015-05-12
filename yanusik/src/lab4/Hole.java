package lab4;

/**
 * Created by dmitry on 12.5.15.
 */

public class Hole {
    public static void main(String[] args) {
        int width = 4;
        int length = 5;
        int radius = 6;
        int diamSquared = width * width + length * length;
        if (diamSquared <= (radius * 2 * 2 * radius)) {
            System.out.printf("zakroet");
        } else {
            System.out.printf("ne zakroet");
        }
    }
}
