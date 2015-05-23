package doplab6;

import static java.lang.Math.*;
import static java.lang.Math.pow;


public class Formula {
    public double firstFormula(int x, int n) {
        double squareRootLast = sqrt(1 / x);
        int degreeA = (int) pow(x, 2);
        double constantE = pow(E, degreeA);
        double degreeFromA = pow(E, x);
        double cosFromE = cos(degreeFromA);
        double squareRootFirst = sqrt(squareRootLast + constantE + cosFromE);
        double sqrtFromUp = pow(squareRootFirst, 1.0 / 3);
        int degreeABot = (int) pow(x, 3);
        double piBot = PI * degreeABot;
        double cosBot = cos(piBot);
        double bracketsBot = pow(x + 1, 2) + n + cosBot;
        double sinX = sin(x);
        double powOfBracketsBot = pow(bracketsBot, sinX);
        return sqrtFromUp / powOfBracketsBot;
    }

    public double secondFormula(int x, int t, int s) {
        double squareRootA = pow(x, t);
        double sinUp = ((cos(2 * squareRootA)) - 1) / 2;
        double sqrtBot = sqrt((pow(x, s) + 1));
        return sinUp / sqrtBot;
    }
}
