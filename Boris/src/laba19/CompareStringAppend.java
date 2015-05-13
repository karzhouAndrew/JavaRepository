package laba19;

//Сравнение двух методов на производительность.
public class CompareStringAppend {


    public static void timeLoopString(String str, int quantityIteration) {
        if (quantityIteration < 1) {
            quantityIteration = 1;
        }
        System.out.println("Время выполнения цикла обычным сложением равно "
                + timeLoop(1, str, quantityIteration) + " секунд.");
        System.out.println("Время выполнения цикла через Builder и append равно "
                + timeLoop(2, str, quantityIteration) + " секунд.");
        System.out.println("Время выполнения цикла через Buffer и append равно "
                + timeLoop(3, str, quantityIteration) + " секунд.");
    }

    private static double timeLoop(int method, String str, int quantityIteration) {
        long timeStart = System.nanoTime();
        if (method == 1) {
            loopString(str, quantityIteration);
        } else if (method == 2) {
            loopStringBuilder(str, quantityIteration);
        } else {
            loopStringBuffer(str, quantityIteration);
        }
        return (System.nanoTime() - timeStart) / 1E9;
    }

    private static void loopStringBuffer(String str, int quantityIteration) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < quantityIteration; i++) {
            stringBuffer.append(str);
        }
    }

    private static void loopString(String str, int quantityIteration) {
        String stringOrdinary = str;
        for (int i = 0; i < quantityIteration; i++) {
            stringOrdinary += str;
        }
    }

    private static void loopStringBuilder(String str, int quantityIteration) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < quantityIteration; i++) {
            stringBuilder.append(str);
        }
    }
}
