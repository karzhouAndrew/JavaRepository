package task19;

//Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
// а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
public class PerformanceTestString {

    public long calculateExecutionTimeString(int loopLimit) {
        String stringFirst = "qwerty";
        String stringSecond = "asdfgh";
        long startTime = System.nanoTime();
        for (int i = 0; i < loopLimit; i++) {
            stringFirst += stringSecond;
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    public long calculateExecutionTimeStringBuilder(int loopLimit) {
        StringBuilder stringFirst = new StringBuilder("qwerty");
        StringBuilder stringSecond = new StringBuilder("asdfgh");

        long startTime = System.nanoTime();
        for (int i = 0; i < loopLimit; i++) {
            stringFirst.append(stringSecond);
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    public long calculateExecutionTimeStringBuffer(int loopLimit) {
        StringBuffer stringFirst = new StringBuffer("qwerty");
        StringBuffer stringSecond = new StringBuffer("asdfgh");

        long startTime = System.nanoTime();
        for (int i = 0; i < loopLimit; i++) {
            stringFirst.append(stringSecond);
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }
}
