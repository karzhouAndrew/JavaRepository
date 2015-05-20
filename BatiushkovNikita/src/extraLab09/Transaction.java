package extraLab09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Transaction {
    int value();
    String autor() default "UNK";
}
