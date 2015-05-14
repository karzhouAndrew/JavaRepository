package laba.add3;

//Find max degree of 100 for type Integer.
public class MaxIntDegree {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        int degree = 0;
        while (number > 100) {
            degree++;
            number /= 100;
        }
        System.out.println("Максимальная степень 100, используемая в типе Integer равна " + degree);
    }
}