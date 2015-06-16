package extraLab09;


public class TestClass {
    @Transaction(name = "Go-go", value = 10)
    public static void annotatedMethod() {
        System.out.println("Transaction...");
    }

    public static void testMethod() {
        System.out.println("Not annotated method");
    }
}
