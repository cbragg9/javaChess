package cp510.assignments.assignment9;

/** An unchecked exception that is raised during 
 *  the course of processing a chess game.
 * @author cbragg
 *
 */
public class ChessException extends RuntimeException {
    
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     *  Default constructor.
     */
    public ChessException() {
        super();
    }
    
    /** Constructor with message.
     * @param message String message
     */
    public ChessException(String message) {
        super(message);
    }
    
    /** Constructor with throwable cause.
     * @param cause Throwable cause
     */
    public ChessException(Throwable cause) {
        super(cause);
    }
    
    /** Constructor with throwable cause and message.
     * @param message String message
     * @param cause Throwable cause
     */
    public ChessException(String message, Throwable cause) {
        super(message, cause);
    }

}
