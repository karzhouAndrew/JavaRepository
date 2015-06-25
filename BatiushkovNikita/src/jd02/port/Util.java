package jd02.port;

import java.util.Random;

public abstract class Util {
    public static int generateRandomInt(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }

    public static boolean generateRandomBool() {
        return new Random().nextBoolean();
    }
}
