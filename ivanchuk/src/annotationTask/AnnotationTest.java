package annotationTask;

public class AnnotationTest {

    @Transaction
    public void getName() {
        String name = "Run method with annotation";
        System.out.println(name);
    }

    public void getText() {
        String text = "Run method without annotation";
        System.out.println(text);
    }
}
