package dopLab9;

public class ClassTransaction {

    @Transaction
    public void go(String str) {

        System.out.println(str);
    }

    public void run() {
        System.out.println("Метод run");
    }

    public void stop() {
        System.out.println("Метод stop");
    }
}