package lab3jd2;


public class SecondTest {
    private static Logger logger = Logger.getInstance();

    public void exceptionThrowing() {
        try {
            int[] firstNumber = new int[5];
            firstNumber[5] = 0;
        } catch (Exception e) {
            logger.log(e);
        }
    }
}
