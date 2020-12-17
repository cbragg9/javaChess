package cp510.assignments.assignment9;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(ChessColor color) {
        super("Queen", "", color);
    }
    
    public java.util.List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {
        return new ArrayList<ChessPoint>();
    }
    
}
