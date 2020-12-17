package cp510.assignments.assignment9;

import java.awt.Image;
import java.util.List;

/** Root class of all chess pieces.
 * @author cbragg
 *
 */
public abstract class ChessPiece {
    private String name;
    private Image image;
    private ChessColor color;
    private boolean isAlive;
    
    ChessPiece(String name, String imagePath, ChessColor color) {
        this.name = name;
        this.image = null;
        this.color = color;
    }
    
    /** Returns a list of all valid moves for this chess piece given 
     *  the state of the chess board.
     * @param chessMap The current state of the chess board.
     * @return stub for abstract class.
     */
    public abstract List<ChessPoint> getValidMoves(ChessPieceMap chessMap);
    
    /** Getter for the name property.
     * @return The value of the name property.
     */
    public String getName() {
        return this.name;
    }
    
    /** Getter for the image property.
     * @return The value of the image property. (null stub)
     */
    public Image getImage() {
        return this.image;
    }
    
    /** Getter for this chess piece's color.
     * @return This chess piece's color.
     */
    public ChessColor getColor() {
        return this.color;
    }
    
    /** Getter for the isAlive property. Returns true if 
     *  this piece has not been captured.
     * @return True if this piece has not been captured.
     */
    public boolean isAlive() {
        return this.isAlive;
    }
    
    /** Setter for the isAlive property.
     * @param alive True if this piece has not been captured.
     */
    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }
}
