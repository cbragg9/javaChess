package cp510.assignments.assignment9;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
    
    public Pawn(ChessColor color) {
        super("Pawn", "", color);
    }
    
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
}
