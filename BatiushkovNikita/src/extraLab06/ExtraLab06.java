package extraLab06;

// Find the value of the function

public class ExtraLab06 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(firstExpression(x));
    }

    private static double firstExpression(int x) {
        double y;
        y = Math.cos(Math.exp(x))*Math.sin(x)/Math.pow(x, 2)*Math.E;
        return y;
    }
}
