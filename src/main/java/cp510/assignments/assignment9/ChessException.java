package cp510.assignments.assignment9;

@SuppressWarnings("serial")
public class ChessException extends RuntimeException {
    public ChessException() {
        super();
    }
    
    public ChessException(String message) {
        super(message);
    }
    
    public ChessException(Throwable cause) {
        super(cause);
    }
    
    public ChessException(String message, Throwable cause) {
        super(message, cause);
    }

}
