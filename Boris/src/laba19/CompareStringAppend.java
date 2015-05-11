package laba19;

import java.sql.Time;

//Сравнение двух методов на производительность.
public class CompareStringAppend {
    private String str;

    CompareStringAppend(String str) {
        this.str = str;
    }

    public void timeLoopString() {
        System.out.println("Время выполнения цикла обычным сложением равно " + timeLoop(true) + " секунд.");
        System.out.println("Время выполнения цикла через Builder и append равно " + timeLoop(false) + " секунд.");
    }

    private double timeLoop(boolean method) {
        long timeStart = System.nanoTime();
        if (method) {
            loopString();
        } else {
            loopStringBuider();
        }
        return (System.nanoTime() - timeStart) / 1E9;
    }

    private void loopString() {
        String string1 = str;
        for (int i = 0; i < 1000; i++) {
            string1 += str;
        }
    }

    private void loopStringBuider() {
        StringBuilder string1 = new StringBuilder(str);
        for (int i = 0; i < 1000; i++) {
            string1.append(str);
        }
    }
}
