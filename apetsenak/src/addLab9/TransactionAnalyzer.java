package addLab9;

import java.lang.reflect.Method;


public class TransactionAnalyzer {
    public void annotationAnalysis(Class clazz) {
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                Transaction tr = method.getAnnotation(Transaction.class);
                System.out.println(tr.info() + ", " + tr.version());
                System.out.println("Transaction is started.");
                try {
                    method.invoke(new CashMachine());
                } catch (Throwable ex) {
                    System.out.println("Transaction is not processing");
                }
                System.out.println("Transaction is ended.");
            }
        }
    }
}
