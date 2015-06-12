package addit09;

public class TestThis {

    @TransactionAnnotation("А ЭТО ПРОСТО ТЕСТОВАЯ СТРОКА В АННОТАЦИИ")
    public void testThisMethod() {
        System.out.println("Выполняется метод с аннотацией TransactionAnnotation.");
    }

    public void testAnotherMethod() {
        System.out.println("Этот метод без аннотации.");
    }
}
