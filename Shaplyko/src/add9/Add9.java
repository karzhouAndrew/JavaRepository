package add9;

import java.lang.reflect.Method;

/**
 * 9. Реализовать аннотацию Transaction и анализатор для данной транзакции. Если метод помечен данной аннотацией,
 * значит он вызывается в рамках транзакции. В рамках транзакции - выводится на консоль два сообщения:
 * 1)	Transaction is started
 * 2)	Transaction is ended
 */
public class Add9 {
    public static void main(String[] args) {
        Class clazz = CheckAnnotation.class;
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Аннотация пресутствует над методом: " + method.getName());
                System.out.println("Transaction is started");
                System.out.println("Transaction is ended");
            }
        }
    }
}
