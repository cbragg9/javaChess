package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.List;

/** Encapsulates the characteristics of a bishop on a chess board. 
 * @author cbragg
 *
 */
public class Bishop extends ChessPiece {
    
    /** Constructor.
     * @param color The color of this bishop
     */
    public Bishop(ChessColor color) {
        super("Bishop", "", color);
    }
    

    /** Given the state of a chess board calculate all valid moves for this 
     *  Rook.If there are no valid moves an empty list will be returned.
     * 
     * @param chessMap
     * @return ArrayList of valid moves
     */
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        ArrayList<ChessPoint> validMoves = new ArrayList<ChessPoint>();
        ChessPoint currentLocation = chessMap.getKey(this);
        
        // Move DL (Row++, Column--)
        int dlRow = currentLocation.getRow() + 1;
        int dlCol = currentLocation.getCol() - 1;
        while (dlRow <= 7 && dlCol <= 7 && dlRow >= 0 && dlCol >= 0) {
            ChessPoint moveDL = new ChessPoint(dlRow, dlCol);
            if (chessMap.get(moveDL) == null) {
                validMoves.add(moveDL);
            } else {
                if (chessMap.get(moveDL).getColor() != this.getColor()) 
                    validMoves.add(moveDL);
                break;
            }
            dlRow += 1;
            dlCol -= 1;
        }
        
        // Move UL (Row--, Column--)
        int ulRow = currentLocation.getRow() - 1;
        int ulCol = currentLocation.getCol() - 1;
        while (ulRow <= 7 && ulCol <= 7 && ulRow >= 0 && ulCol >= 0) {
            ChessPoint moveUl = new ChessPoint(ulRow, ulCol);
            if (chessMap.get(moveUl) == null) {
                validMoves.add(moveUl);
            } else {
                if (chessMap.get(moveUl).getColor() != this.getColor()) 
                    validMoves.add(moveUl);
                break;
            }
            ulRow -= 1;
            ulCol -= 1;
        }
        
        // Move UR (Row--, Column++)
        int urRow = currentLocation.getRow() - 1;
        int urCol = currentLocation.getCol() + 1;
        while (urRow <= 7 && urCol <= 7 && urRow >= 0 && urCol >= 0) {
            ChessPoint moveUR = new ChessPoint(urRow, urCol);
            if (chessMap.get(moveUR) == null) {
                validMoves.add(moveUR);
            } else {
                if (chessMap.get(moveUR).getColor() != this.getColor()) 
                    validMoves.add(moveUR);
                break;
            }
            urRow -= 1;
            urCol += 1;
        }
        
        // Move DR (Row++, Column++)
        int drRow = currentLocation.getRow() + 1;
        int drCol = currentLocation.getCol() + 1;
        while (drRow <= 7 && drCol <= 7 && drRow >= 0 && drCol >= 0) {
            ChessPoint moveDR = new ChessPoint(drRow, drCol);
            if (chessMap.get(moveDR) == null) {
                validMoves.add(moveDR);
            } else {
                if (chessMap.get(moveDR).getColor() != this.getColor()) 
                    validMoves.add(moveDR);
                break;
            }
            drRow += 1;
            drCol += 1;
        }
        
        return validMoves;
    }
}
