package cp510.assignments.assignment9;

import java.util.ArrayList;

/** Encapsulates the characteristics of a king on a chess board.
 * @author cbragg 
 *
 */
public class King extends ChessPiece {
    
    /** Constructor.
     * @param color The color of this king.
     */
    public King(ChessColor color) {
        super("King", "", color);
    }
    
    /** Stub that returns an empty list.
     * @param chessMap Not used.
     * @return An empty List<ChessPoint>.
     */
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
}
