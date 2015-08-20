package port;

/**
 * Created by Master on 28.06.2015.
 */
public class ResourceException extends Exception {
    public ResourceException() {
        super();
    }

    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(Throwable cause) {
        super(cause);
    }
}
