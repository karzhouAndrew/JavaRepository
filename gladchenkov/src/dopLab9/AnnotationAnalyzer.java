package dopLab9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class AnnotationAnalyzer {
    public void analyze() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Methods> obj = Methods.class;
        Method[] someMethods = obj.getMethods();
        for (Method method : someMethods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started ");
                method.invoke(obj.newInstance(), null);
                System.out.println("Transaction is ended ");
            }
        }
    }
}

