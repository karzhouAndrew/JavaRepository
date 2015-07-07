package jd03.lab09;

public final class CounterManager {
    public static final String PATH = "./Counter.txt";
    private static int count;

    public CounterManager() {
        count = 1;
    }

    public static void writeCountFile() {
        FileManager file = new FileManager();
        file.writeFile(String.valueOf(++count), PATH);
    }

    public static int readCountFile() {
        FileManager file = new FileManager();
        String count = file.readFile(PATH);
        return Integer.parseInt(count);
    }
}
