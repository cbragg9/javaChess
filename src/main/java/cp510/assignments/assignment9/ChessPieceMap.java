package cp510.assignments.assignment9;

import java.util.HashMap;

@SuppressWarnings("serial")
public class ChessPieceMap extends HashMap<ChessPoint, ChessPiece> {
    
    public ChessPieceMap() {
        super(100, (float) 0.75);
    }
    
    public ChessPiece get(ChessPoint point) throws ChessException {
        if (point.getRow() > 7 || point.getRow() < 0 || point.getCol() > 7 || point.getRow() < 0) throw new ChessException();
        for (ChessPoint i : this.keySet()) {
            if (i.getRow() == point.getRow() && i.getCol() == point.getCol()) {
                return super.get(i);
            }
        } 
        return super.get(point);
    }
    
    public ChessPoint getKey​(ChessPiece piece) {
        for (ChessPoint i : this.keySet()) {
            if (super.get(i).getName() == piece.getName() && super.get(i).getColor() == piece.getColor()) {
                return i;
            }
        } 
        return null;
    }
    
    public ChessPiece put​(ChessPoint point, ChessPiece piece) throws ChessException {
        ChessPiece removed = this.get(point);
        super.put(point, piece);
        return removed;
    }
    
    public static ChessPieceMap newGame() {
        ChessPieceMap newGame = new ChessPieceMap();
        Rook R = new Rook(ChessColor.WHITE);
        Knight K = new Knight(ChessColor.WHITE);
        Bishop B = new Bishop(ChessColor.WHITE);
        King KI = new King(ChessColor.WHITE);
        Queen Q = new Queen(ChessColor.WHITE);
        Bishop B2 = new Bishop(ChessColor.WHITE);
        Knight K2 = new Knight(ChessColor.WHITE);
        Rook R2 = new Rook(ChessColor.WHITE);
        Pawn P1 = new Pawn(ChessColor.WHITE);
        Pawn P2 = new Pawn(ChessColor.WHITE);
        Pawn P3 = new Pawn(ChessColor.WHITE);
        Pawn P4 = new Pawn(ChessColor.WHITE);
        Pawn P5 = new Pawn(ChessColor.WHITE);
        Pawn P6 = new Pawn(ChessColor.WHITE);
        Pawn P7 = new Pawn(ChessColor.WHITE);
        Pawn P8 = new Pawn(ChessColor.WHITE);
        Rook r = new Rook(ChessColor.BLACK);
        Knight k = new Knight(ChessColor.BLACK);
        Bishop b = new Bishop(ChessColor.BLACK);
        King ki = new King(ChessColor.BLACK);
        Queen q = new Queen(ChessColor.BLACK);
        Bishop b2 = new Bishop(ChessColor.BLACK);
        Knight k2 = new Knight(ChessColor.BLACK);
        Rook r2 = new Rook(ChessColor.BLACK);
        Pawn p1 = new Pawn(ChessColor.BLACK);
        Pawn p2 = new Pawn(ChessColor.BLACK);
        Pawn p3 = new Pawn(ChessColor.BLACK);
        Pawn p4 = new Pawn(ChessColor.BLACK);
        Pawn p5 = new Pawn(ChessColor.BLACK);
        Pawn p6 = new Pawn(ChessColor.BLACK);
        Pawn p7 = new Pawn(ChessColor.BLACK);
        Pawn p8 = new Pawn(ChessColor.BLACK);
        
        ChessPoint rpoint = new ChessPoint(0, 0);
        ChessPoint kpoint = new ChessPoint(0, 1);
        ChessPoint bpoint = new ChessPoint(0, 2);
        ChessPoint kipoint = new ChessPoint(0, 3);
        ChessPoint qpoint = new ChessPoint(0, 4);
        ChessPoint b2point = new ChessPoint(0, 5);
        ChessPoint k2point = new ChessPoint(0, 6);
        ChessPoint r2point = new ChessPoint(0, 7);
        ChessPoint p1point = new ChessPoint(1, 0);
        ChessPoint p2point = new ChessPoint(1, 1);
        ChessPoint p3point = new ChessPoint(1, 2);
        ChessPoint p4point = new ChessPoint(1, 3);
        ChessPoint p5point = new ChessPoint(1, 4);
        ChessPoint p6point = new ChessPoint(1, 5);
        ChessPoint p7point = new ChessPoint(1, 6);
        ChessPoint p8point = new ChessPoint(1, 7);
        ChessPoint Rpoint = new ChessPoint(7, 0);
        ChessPoint Kpoint = new ChessPoint(7, 1);
        ChessPoint Bpoint = new ChessPoint(7, 2);
        ChessPoint KIpoint = new ChessPoint(7, 3);
        ChessPoint Qpoint = new ChessPoint(7, 4);
        ChessPoint B2point = new ChessPoint(7, 5);
        ChessPoint K2point = new ChessPoint(7, 6);
        ChessPoint R2point = new ChessPoint(7, 7);
        ChessPoint P1point = new ChessPoint(6, 0);
        ChessPoint P2point = new ChessPoint(6, 1);
        ChessPoint P3point = new ChessPoint(6, 2);
        ChessPoint P4point = new ChessPoint(6, 3);
        ChessPoint P5point = new ChessPoint(6, 4);
        ChessPoint P6point = new ChessPoint(6, 5);
        ChessPoint P7point = new ChessPoint(6, 6);
        ChessPoint P8point = new ChessPoint(6, 7);
        
        
        newGame.put(rpoint, r);
        newGame.put(kpoint, k);
        newGame.put(bpoint, b);
        newGame.put(kipoint, ki);
        newGame.put(qpoint, q);
        newGame.put(b2point, b2);
        newGame.put(k2point, k2);
        newGame.put(r2point, r2);
        newGame.put(p1point, p1);
        newGame.put(p2point, p2);
        newGame.put(p3point, p3);
        newGame.put(p4point, p4);
        newGame.put(p5point, p5);
        newGame.put(p6point, p6);
        newGame.put(p7point, p7);
        newGame.put(p8point, p8);
        newGame.put(Rpoint, R);
        newGame.put(Kpoint, K);
        newGame.put(Bpoint, B);
        newGame.put(KIpoint, KI);
        newGame.put(Qpoint, Q);
        newGame.put(B2point, B2);
        newGame.put(K2point, K2);
        newGame.put(R2point, R2);
        newGame.put(P1point, P1);
        newGame.put(P2point, P2);
        newGame.put(P3point, P3);
        newGame.put(P4point, P4);
        newGame.put(P5point, P5);
        newGame.put(P6point, P6);
        newGame.put(P7point, P7);
        newGame.put(P8point, P8);
                        
        return newGame;
    }
}
