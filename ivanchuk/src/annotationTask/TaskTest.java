package annotationTask;

//Реализовать аннотацию Transaction и анализатор для данной транзакции.
//Если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
//В рамках транзакции - выводится на консоль два сообщения:
//1) Transaction is started
//2) Transaction is ended

public class TaskTest {

    public static void main(String[] args) {
        AnnotationTest annotationTest = new AnnotationTest();
        TransactionAnalyzer.parse(annotationTest);
    }
}
