package lab19;

/**
 * Напишите два цикла выполняющих многократное сложение строк,
 * один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Task {
    public static void main(String[] args) {
        SpeedTest test = new SpeedTest();
        test.showSpeedTestResult();
    }
}
