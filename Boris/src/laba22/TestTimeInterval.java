package laba22;

//Проверка класса

public class TestTimeInterval {
    public static void main(String[] args) {
        TimeInterval intervalFirst = new TimeInterval(2, 3, 70);
        TimeInterval intervalSecond = new TimeInterval(3660);
        System.out.println(intervalSecond.intervalCompare(intervalFirst));
        System.out.println(intervalFirst.toString());
        intervalSecond.lookTime();
        intervalFirst.lookTime();
        System.out.println(intervalSecond.intervalInSeconds());
    }
}
