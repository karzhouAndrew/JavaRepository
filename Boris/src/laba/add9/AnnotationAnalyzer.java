package laba.add9;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationAnalyzer {
    public void checkClass (Class<?> clazz) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Method [] methods = clazz.getMethods();
        for (Method method : methods) {
                if (method.isAnnotationPresent(TransactionAnnotation.class)){
                    System.out.println("Transaction is started.");
                    method.invoke(clazz.newInstance(), 1000);
                    System.out.println("Transaction is ended.");
                }
        }
    }
}
