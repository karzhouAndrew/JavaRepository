package dopLab9;

public class Methods {

    @Transaction
    public void go() {
        System.out.println("Метод go");
    }

    public void run() {
        System.out.println("Метод run");
    }

    public void stop() {
        System.out.println("Метод stop");
    }
}