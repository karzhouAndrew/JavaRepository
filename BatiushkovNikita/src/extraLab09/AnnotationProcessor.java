package extraLab09;

// Реализовать аннотацию Transaction и анализатор для данной транзакции.
// Если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
// В рамках транзакции - выводится на консоль два сообщения:
// 1)	Transaction is started
// 2)	Transaction is ended

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        inspectAnnotation(TestClass.class);
    }

    public static void inspectAnnotation(Class transaction) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = transaction.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started");
                method.invoke(null);
                System.out.println("Transaction is ended");
            }
        }
    }
}
