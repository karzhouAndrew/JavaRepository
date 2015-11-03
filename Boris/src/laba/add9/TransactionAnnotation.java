package laba.add9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Реализовать аннотацию Transaction и анализатор для данной транзакции. Если метод помечен данной аннотацией,
// значит он вызывается в рамках транзакции. В рамках транзакции - выводится на консоль два сообщения:
//1)	Transaction is started
//2)	Transaction is ended
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TransactionAnnotation {
}
