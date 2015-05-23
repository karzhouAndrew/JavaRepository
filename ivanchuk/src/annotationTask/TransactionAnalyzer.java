package annotationTask;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionAnalyzer {

    public static void parse(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.toString().equals("@annotationTask.Transaction()")) {
                    System.out.println("Transaction is started");
                    try {
                        method.invoke(object, null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Transaction is ended");
                }
            }
        }
    }
}


