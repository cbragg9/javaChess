package cp510.assignments.assignment9;

import java.util.Objects;

/** This class captures the location of a square on the board.
 * @author cbragg
 *
 */
public class ChessPoint {
    private int row;
    private int col;
    
    /**
     *  Sets the row and col properties to (0, 0).
     */
    public ChessPoint() {
        this.row = 0;
        this.col = 0;
    }
    
    /** Sets the row and column to the given values.
     * @param row The given row.
     * @param col The given column.
     */ 
    public ChessPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    /** Copy constructor; copies the properties of the given 
     *  ChessPoint to this ChessPoint.
     * @param toCopy The given ChessPoint.
     */
    public ChessPoint(ChessPoint toCopy) {
        this.row = toCopy.row;
        this.col = toCopy.col;
    }
    
    /** Adds the given values to the row and column of this object. 
     * If the operation would cause either property to be less than 0 
     * or greater than 7 the operation is not performed and false is returned.
     * @param row The value to add to row.
     * @param col The value to add to col.
     * @return True if the result of the operation is the location of a 
     * square on a chess board.
     */
    public boolean add (int row, int col) {
        if (this.row + row > 7 || 
            this.row + row < 0 || 
            this.col + col > 7 || 
            this.col + col < 0) {
            return false;
        } else {
            this.row += row;
            this.col += col;
            return true;
        }
    }
    
    /** Calculates a hash code for this ChessPoint. 
     * The algorithm produces a perfect hash in the range (0, 0) to (7, 7), 
     * inclusive. There should never be a collision between two points on a 
     * chess board.
     * @return The calculated hashcode.
     */
    public int hashCode() {
        return Objects.hash(8 * this.row + this.col);
    }
    
    /** Getter for the column property.
     * @return The value of the column property.
     */
    public int getCol() {
        return this.col;
    }
    
    /** Setter for the column property.
     * @param col The new value of the column property.
     */
    public void setCol(int col) {
        this.col = col;
    }
    
    /** Getter for the row property.
     * @return The value of the row property.
     */
    public int getRow() {
        return this.row;
    }
    
    /** Setter for the row property.
     * @param row The new value of the row property.
     */
    public void setRow(int row) {
        this.row = row;
    }
    
    /** Convenience method to set the row and column properties 
     *  at the same time.
     * @param row The new value of the column property.
     * @param col The new value of the row property.
     */
    public void setPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    /**
     * Returns a readable string representing the properties of 
     * this ChessPoint. 
     * @return A  readable string representing the properties of 
     * this ChessPoint.
     */
    public String toString() {
        return "row = " + this.row + ", column = " + this.col;
    }
}
