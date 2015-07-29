package lab4;

//find out if the circle's area cover the hole
public class Area {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int r = 4;
        int d = r * 2;
        double c = Math.sqrt(a * a + b * b);
        if (d >= c) {
            System.out.println("Yes, it will.");
        } else {
            System.out.println("No, it won\'t");
        }

    }
}
