package cp510.assignments.assignment9;

import java.util.ArrayList;

/** Encapsulates the characteristics of a knight on a chess board.
 * @author cbragg 
 *
 */
public class Knight extends ChessPiece {
    
    /** Constructor.
     * @param color The color of this knight.
     */
    public Knight(ChessColor color) {
        super("Knight", "", color);
    }
    
    /** Stub that returns an empty list.
     * @param chessMap Not used.
     * @return An empty List<ChessPoint>.
     */
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
}
