package laba.add9;


import java.lang.reflect.InvocationTargetException;

public class TestAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
       AnnotationAnalyzer analyzer = new AnnotationAnalyzer();
        analyzer.checkClass(Transaction.class);

    }
}
