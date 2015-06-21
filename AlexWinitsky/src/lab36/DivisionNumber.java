package lab36;

/**
 * Created by Master on 12.06.2015.
 */
public class DivisionNumber {
    public int division(int firstNumber, int secondNumber) {
        int result = 0;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            CreateLogger createLogger = CreateLogger.getInstance();
            String str = "Ошибка деления на ноль";
            System.out.println(str);
            createLogger.writeFile(str + firstNumber + "/" + secondNumber);
        }
        return result;
    }
}
