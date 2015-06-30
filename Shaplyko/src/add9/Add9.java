package add9;

/**
 * 9. Реализовать аннотацию Transaction и анализатор для данной транзакции. Если метод помечен данной аннотацией,
 * значит он вызывается в рамках транзакции. В рамках транзакции - выводится на консоль два сообщения:
 * 1)  Transaction is started
 * 2)  Transaction is ended
 */
public class Add9 {
    public static void main(String[] args) {
        TransactionAnnotation transactionAnnotation = new TransactionAnnotation();
        transactionAnnotation.testAnnotation(CheckAnnotation.class);
    }
}