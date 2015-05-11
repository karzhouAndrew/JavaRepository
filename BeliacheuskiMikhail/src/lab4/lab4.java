package lab4;

import static java.lang.Math.*;

/**
 * We have quadrangle hole with proportions a,b. Need to know is it possible to cover this hole by the round carton with radius r.
 */
public class lab4 {
    public static void main(String[] args) {
        int sideA = 6;
        int sideB = 8;
        double radius = 5.0;
        int quadHalfA = (int) pow(sideA / 2, 2);
        int quadHalfB = (int) pow(sideB / 2, 2);
        int halfParallel = (int) sqrt(quadHalfA + quadHalfB);
        if (radius >= halfParallel) {
            System.out.println("Proportions of quadrangle are " + sideA + "x" + sideB + ". Half of quadrangel's parallel is " + halfParallel + ". Radius of round carton is " + radius + ". Mystery! Hole is covered fully.");
        } else {
            System.out.println("Proportions of quadrangle are " + sideA + "x" + sideB + ". Half of quadrangel's parallel is " + halfParallel + ". Radius of round carton is " + radius + ". Carton less then hole. Failed.  ");
        }
    }
}
