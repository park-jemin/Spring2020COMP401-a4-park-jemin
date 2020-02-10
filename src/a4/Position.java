package a4;

/* 
 * Position
 * Represents an integer (x,y) position on a grid.
 *  
 * getX()
 *   Retrieves x coordinate of the position
 *  
 * getY()
 *   Retrieves y coordinate of the position
 *   
 * getManhattanDistanceTo(Position p)
 *   Calculates the "Manhattan" distance between two positions.
 *   The Manhattan distance is simply the absolute difference in x positions
 *   summed with the absolute difference in y positions.
 */

public interface Position {
	int getX();
	int getY();
	
	default int getManhattanDistanceTo(Position p) {
		if (p.equals(null)) {
			throw new RuntimeException("Attempted to get distance to null position");
		}
		
		return Math.abs(p.getX() - getX()) + Math.abs(p.getY() - getY());
	}
	
}
