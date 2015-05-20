package extraLab09;

// Реализовать аннотацию Transaction и анализатор для данной транзакции.
// Если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
// В рамках транзакции - выводится на консоль два сообщения:
// 1) Transaction is started
// 2) Transaction is ended

public class ExtraLab09 {
    private final static int VALUE = 100;

    @Transaction(34)
    public static void main(String[] args) {
        for (int i = 0; i < VALUE; i++) {
        }
    }
}
