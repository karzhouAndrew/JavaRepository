package add9;
import java.lang.reflect.Method;

public class TransactionAnnotation {
    public void testAnnotation(Class clazz) {
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                Transaction transaction = method.getAnnotation(Transaction.class);
                System.out.println(transaction.info());
                System.out.println("Аннотация пресутствует над методом: " + method.getName());
                System.out.println("Transaction is started.");
                try {
                    method.invoke(clazz);
                } catch (Throwable e) {
                    System.out.println("Transaction is not processing");
                }
                System.out.println("Transaction is ended.");
            }
        }
    }
}
