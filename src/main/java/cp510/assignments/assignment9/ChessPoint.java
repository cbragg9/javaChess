package cp510.assignments.assignment9;

import java.util.Objects;

public class ChessPoint {
    private int row;
    private int col;
    
    public ChessPoint() {
        this.row = 0;
        this.col = 0;
    }
    
    public ChessPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public ChessPoint(ChessPoint toCopy) {
        this.row = toCopy.row;
        this.col = toCopy.col;
    }
    
    public boolean add (int row, int col) {
        if (this.row + row > 7 || this.row + row < 0 || this.col + col > 7 || this.col + col < 0) {
            return false;
        } else {
            this.row += row;
            this.col += col;
            return true;
        }
    }
    
    public int hashCode() {
        return Objects.hash(8 * this.row + this.col);
    }
    
    public int getCol() {
        return this.col;
    }
    
    public void setCol(int col) {
        this.col = col;
    }
    
    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public void setPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public String toString() {
        return "row = " + this.row + ", column = " + this.col;
    }
}
