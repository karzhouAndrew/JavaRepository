package lab3jd2;


public class FirstTest {
    private static Logger logger = Logger.getInstance();

    public void exceptionThrowing() {
        try {
            int firstNumber = 10;
            int secondNumber = 0;
            int result = firstNumber / secondNumber;
        } catch (Exception e) {
            logger.log(e);
        }
    }
}
