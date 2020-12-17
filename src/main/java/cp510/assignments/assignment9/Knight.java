package cp510.assignments.assignment9;

import java.util.ArrayList;

public class Knight extends ChessPiece {
    
    public Knight(ChessColor color) {
        super("Knight", "", color);
    }
    
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
}
