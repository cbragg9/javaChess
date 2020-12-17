package cp510.assignments.assignment9;

import java.util.HashMap;

/** Encapsulates a mapping from a ChessPoint to a ChessPiece.
 * @author cbragg
 *
 */
public class ChessPieceMap extends HashMap<ChessPoint, ChessPiece> {
    
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /** Constructor. Creates a <ChessPoint,ChessPiece> map with an 
     *  initial size of 100, and a load factor of .75.
     * 
     */
    public ChessPieceMap() {
        super(100, (float) 0.75);
    }
    
    /** Returns the ChessPiece mapped to the given ChessPoint. 
     *  This method is identical to Map<ChessPoint,ChessPiece>.get, 
     *  but throws an exception if the given point is not a valid square. 
     *  Returns null if the ChessPoint is not in the map.
     * @param point The key to the target ChessPiece.
     * @return The value associated with the key, or null if none found.
     * @throws ChessException Throws ChessException if the given ChessPoint 
     * is not a valid square.
     */
    public ChessPiece get(ChessPoint point) throws ChessException {
        if (point.getRow() > 7 || 
            point.getRow() < 0 || 
            point.getCol() > 7 || 
            point.getRow() < 0) throw new ChessException();
        for (ChessPoint i : this.keySet()) {
            if (i.getRow() == point.getRow() && i.getCol() == point.getCol()) {
                return super.get(i);
            }
        } 
        return super.get(point);
    }
    
    /** Gets the key associated with the given value. 
     *  Returns null if the given value cannot be found.
     * @param piece The chess piece to be found.
     * @return The key associated with the given value, or 
     * null if the value cannot be found
     */
    public ChessPoint getKey(ChessPiece piece) {
        for (ChessPoint i : this.keySet()) {
            if (super.get(i).getName() == piece.getName() && 
                super.get(i).getColor() == piece.getColor()) {
                return i;
            }
        } 
        return null;
    }
    
    /** Adds a ChessPoint/ChessPiece entry to the map. 
     *  Null values are not permitted. 
     *  This method is identical to Map<ChessPoint,ChessPiece>.put, 
     *  but throws an exception if the given point is not a valid square on a 
     *  chess board, or the given value is null.
     * @param point The key for the new entry.
     * @param piece The value for the new entry.
     * @return The value previously associated with the key, or null if none.
     * @throws ChessException Throws ChessException if the given key is not a 
     * valid square on a chess board, or if the given value is null.
     */
    public ChessPiece put (ChessPoint point, ChessPiece piece)
        throws ChessException {
        ChessPiece removed = this.get(point);
        super.put(point, piece);
        return removed;
    }
    
    /** Instantiates a ChessMap with all pieces in the traditional 
     *  start positions; a black rook will be in square (0, 0).
     * @return A ChessMap with all pieces in the traditional start positions.
     */
    public static ChessPieceMap newGame() {
        ChessPieceMap newGame = new ChessPieceMap();
        Rook whiteR = new Rook(ChessColor.WHITE);
        Knight whiteK = new Knight(ChessColor.WHITE);
        Bishop whiteB = new Bishop(ChessColor.WHITE);
        King whiteKI = new King(ChessColor.WHITE);
        Queen whiteQ = new Queen(ChessColor.WHITE);
        Bishop whiteB2 = new Bishop(ChessColor.WHITE);
        Knight whiteK2 = new Knight(ChessColor.WHITE);
        Rook whiteR2 = new Rook(ChessColor.WHITE);
        Pawn whiteP1 = new Pawn(ChessColor.WHITE);
        Pawn whiteP2 = new Pawn(ChessColor.WHITE);
        Pawn whiteP3 = new Pawn(ChessColor.WHITE);
        Pawn whiteP4 = new Pawn(ChessColor.WHITE);
        Pawn whiteP5 = new Pawn(ChessColor.WHITE);
        Pawn whiteP6 = new Pawn(ChessColor.WHITE);
        Pawn whiteP7 = new Pawn(ChessColor.WHITE);
        Pawn whiteP8 = new Pawn(ChessColor.WHITE);
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
        ChessPoint pointR = new ChessPoint(7, 0);
        ChessPoint pointK = new ChessPoint(7, 1);
        ChessPoint pointB = new ChessPoint(7, 2);
        ChessPoint pointKi = new ChessPoint(7, 3);
        ChessPoint pointQ = new ChessPoint(7, 4);
        ChessPoint pointB2 = new ChessPoint(7, 5);
        ChessPoint pointK2 = new ChessPoint(7, 6);
        ChessPoint pointR2 = new ChessPoint(7, 7);
        ChessPoint pointP1 = new ChessPoint(6, 0);
        ChessPoint pointP2 = new ChessPoint(6, 1);
        ChessPoint pointP3 = new ChessPoint(6, 2);
        ChessPoint pointP4 = new ChessPoint(6, 3);
        ChessPoint pointP5 = new ChessPoint(6, 4);
        ChessPoint pointP6 = new ChessPoint(6, 5);
        ChessPoint pointP7 = new ChessPoint(6, 6);
        ChessPoint pointP8 = new ChessPoint(6, 7);
        
        
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
        newGame.put(pointR, whiteR);
        newGame.put(pointK, whiteK);
        newGame.put(pointB, whiteB);
        newGame.put(pointKi, whiteKI);
        newGame.put(pointQ, whiteQ);
        newGame.put(pointB2, whiteB2);
        newGame.put(pointK2, whiteK2);
        newGame.put(pointR2, whiteR2);
        newGame.put(pointP1, whiteP1);
        newGame.put(pointP2, whiteP2);
        newGame.put(pointP3, whiteP3);
        newGame.put(pointP4, whiteP4);
        newGame.put(pointP5, whiteP5);
        newGame.put(pointP6, whiteP6);
        newGame.put(pointP7, whiteP7);
        newGame.put(pointP8, whiteP8);
                        
        return newGame;
    }
}
