package cp510.assignments.assignment9;

import java.awt.Image;
import java.util.List;

public abstract class ChessPiece {
    private String name;
    private Image image;
    private ChessColor color;
    private boolean isAlive;
    
    ChessPiece(String name, String imagePath, ChessColor color) {
        this.name = name;
        this.image = null;
        this.color = color;
    }
    
    public abstract List<ChessPoint> getValidMoves​(ChessPieceMap chessMap);
    
    public String getName() {
        return this.name;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public ChessColor getColor() {
        return this.color;
    }
    
    public boolean isAlive() {
        return this.isAlive;
    }
    
    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }
}
