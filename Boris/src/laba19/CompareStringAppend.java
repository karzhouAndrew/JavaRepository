package laba19;

import java.sql.Time;

//Сравнение двух методов на производительность.
public class CompareStringAppend {
    private String str;

    CompareStringAppend(String str) {
        this.str = str;
    }

    public void TimeLoopString() {
        System.out.println("Время выполнения цикла обычным сложением равно " + TimeLoop(true));
        System.out.println("Время выполнения цикла через .append равно " + TimeLoop(false));
    }

    private int TimeLoop(boolean method) {
        int timeStart = (int) System.nanoTime();
        if (method) {
            LoopString();
        } else {
            LoopStringBuider();
        }
        return (int) (System.nanoTime() - timeStart);
    }

    private void LoopString() {
        String string1 = str;
        for (int i = 0; i < 1000; i++) {
            string1 += str;
        }
    }

    private void LoopStringBuider() {
        StringBuilder string1 = new StringBuilder(str);
        for (int i = 0; i < 1000; i++) {
            string1.append(str);
        }
    }
}
