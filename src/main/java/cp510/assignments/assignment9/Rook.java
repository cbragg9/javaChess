package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessPiece {
    
    public Rook(ChessColor color) {
        super("Rook", "", color);
    }
    
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        ArrayList<ChessPoint> validMoves = new ArrayList<ChessPoint>();
        ChessPoint currentLocation = chessMap.getKey​(this);
        
        // Move Down (Row++, Column stays the same)
        for (int i = currentLocation.getRow(); i < 7; i++) {
            ChessPoint downOne = new ChessPoint(i + 1,currentLocation.getCol());
            if (chessMap.get(downOne) == null) {
                validMoves.add(downOne);
            } else {
                if (chessMap.get(downOne).getColor() != this.getColor()) validMoves.add(downOne);
                break;
            }
        }
        
        // Move Up (Row--, Column stays the same)
        for (int i = currentLocation.getRow(); i > 0; i--) {
            ChessPoint upOne = new ChessPoint(i - 1,currentLocation.getCol());
            if (chessMap.get(upOne) == null) {
                validMoves.add(upOne);
            } else {
                if (chessMap.get(upOne).getColor() != this.getColor()) validMoves.add(upOne);
                break;
            }
        }
        
        // Move Right (Row stays the same, Column++)
        for (int i = currentLocation.getCol(); i < 7; i++) {
            ChessPoint rightOne = new ChessPoint(currentLocation.getRow(),i+1);
            if (chessMap.get(rightOne) == null) {
                validMoves.add(rightOne);
            } else {
                if (chessMap.get(rightOne).getColor() != this.getColor()) validMoves.add(rightOne);
                break;
            }
        }
        
        // Move Left (Row stays the same, Column--)
        for (int i = currentLocation.getCol(); i > 0; i--) {
            ChessPoint leftOne = new ChessPoint(currentLocation.getRow(),i-1);
            if (chessMap.get(leftOne) == null) {
                validMoves.add(leftOne);
            } else {
                if (chessMap.get(leftOne).getColor() != this.getColor()) validMoves.add(leftOne);
                break;
            }
        }
        
        return validMoves;
    }
}
