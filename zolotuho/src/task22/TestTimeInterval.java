package task22;

public class TestTimeInterval {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(3600);
        TimeInterval timeInterval2 = new TimeInterval(19, 26, 45);
        TimeInterval timeInterval3 = new TimeInterval(0, 0, 1);
        if (timeInterval.equals(timeInterval3)) {
            System.out.println(timeInterval2);
            System.out.println("This class full seconds = " + timeInterval2.calculateFullSeconds());
        }
        System.out.println(timeInterval.getSeconds());
        System.out.println(timeInterval.getMinutes());
        System.out.println(timeInterval.getHours());
    }
}
