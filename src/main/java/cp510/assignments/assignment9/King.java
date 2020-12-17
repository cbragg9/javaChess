package cp510.assignments.assignment9;

import java.util.ArrayList;

public class King extends ChessPiece {
    
    public King(ChessColor color) {
        super("King", "", color);
    }
    
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
}
