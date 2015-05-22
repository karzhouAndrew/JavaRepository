package laba22;

//Проверка класса

public class TestTimeInterval {
    public static void main(String[] args) {
        TimeInterval firstInterval = new TimeInterval(2, 3, 70);
        TimeInterval secondInterval = new TimeInterval(3660);
        System.out.println(secondInterval.intervalCompare(firstInterval));
        System.out.println(secondInterval.equals(firstInterval));
        System.out.println(firstInterval);
        System.out.println(secondInterval.intervalInSeconds());
    }
}
