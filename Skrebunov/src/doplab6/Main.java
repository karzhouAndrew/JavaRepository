package doplab6;


public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula();
        double resultFromFirst = formula.firstFormula(5, 5);
        System.out.println(resultFromFirst);
        double resultFromSecond = formula.secondFormula(1, 1, 3);
        System.out.println(resultFromSecond);
    }
}
