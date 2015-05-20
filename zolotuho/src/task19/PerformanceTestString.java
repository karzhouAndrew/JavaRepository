package task19;

//Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
// а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
public class PerformanceTestString {

    public long calculateExecutionTime(String stringFirst, String stringSecond, int loopLimit) {
        long n1 = System.nanoTime();
        for (int i = 0; i < loopLimit; i++) {
            stringFirst += stringSecond;
        }
        long n2 = System.nanoTime();
        return n2 - n1;
    }

    public long calculateExecutionTime(StringBuilder stringFirst, StringBuilder stringSecond, int loopLimit) {
        long n1 = System.nanoTime();
        n1 = System.nanoTime();
        for (int i = 0; i < loopLimit; i++) {
            stringFirst.append(stringSecond);
        }
        long n2 = System.nanoTime();
        return n2 - n1;
    }
}
