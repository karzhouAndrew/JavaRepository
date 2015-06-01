package dopLab9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class AnnotationAnalyzer {
    public void analyze(Class aClass) throws InvocationTargetException, IllegalAccessException, InstantiationException {

        Method[] someMethods = aClass.getMethods();
        for (Method method : someMethods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started ");
                method.invoke(aClass.newInstance(), "Объект");
                System.out.println("Transaction is ended ");
            }
        }
    }
}

