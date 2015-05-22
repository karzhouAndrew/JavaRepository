package dopLab9;

import java.lang.reflect.InvocationTargetException;

public class DopLabs9Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        AnnotationAnalyzer analyzer = new AnnotationAnalyzer();
        analyzer.analyze();
    }
}