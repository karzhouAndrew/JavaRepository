package lab19;


public class SpeedTest {
    public long testString() {
        long startTime = System.nanoTime();
        String testString = "Test";
        for (int i = 0; i < 100; i++) {
            testString += "Test";
        }
        return System.nanoTime() - startTime;
    }

    public long testStringBuilder() {
        long startTime = System.nanoTime();
        StringBuilder testString = new StringBuilder("Test");
        for (int i = 0; i < 100; i++) {
            testString.append("Test");
        }
        return System.nanoTime() - startTime;
    }

    public long testStringBuffer() {
        long startTime = System.nanoTime();
        StringBuffer testString = new StringBuffer("Test");
        for (int i = 0; i < 100; i++) {
            testString.append("Test");
        }
        return System.nanoTime() - startTime;
    }

    public void showSpeedTestResult() {
        System.out.println("Время выполнения сложения строк с помощью String - " + testString());
        System.out.println("Время выполнения сложения строк с помощью StringBuilder - " + testStringBuilder());
        System.out.println("Время выполнения сложения строк с помощью StringBuffer - " + testStringBuffer());
    }
}
