package addit09;

import java.lang.reflect.Method;

public class AnnotationAnalyzer {
    public void analyseAnnotation(Class clazz) {
        for (Method meth : clazz.getMethods()) {
            if (meth.isAnnotationPresent(TransactionAnnotation.class)) {
                System.out.println("Transaction is started");
                TransactionAnnotation transactionAnnotation = meth.getAnnotation(TransactionAnnotation.class);
                System.out.println("Текущий метод отмечен аннотацией, дополнительные сведения: " + transactionAnnotation.value());
                try {
                    meth.invoke(clazz.newInstance());
                } catch (Exception e) {
                    System.out.println("Исключительная ситуация: " + e);
                }
                System.out.println("Transaction is ended");
            }
        }
    }
}
