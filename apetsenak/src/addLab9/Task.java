package addLab9;

/**
 * Реализовать аннотацию Transaction и анализатор для данной транзакции.
 * Если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
 * В рамках транзакции - выводится на консоль два сообщения:
 * 1)	Transaction is started
 * 2)	Transaction is ended
 */
public class Task {
    public static void main(String[] args) {
        TransactionAnalyzer analyzer = new TransactionAnalyzer();
        analyzer.annotationAnalysis(CashMachine.class);
    }
}
