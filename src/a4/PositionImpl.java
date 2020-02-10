package a4;

public class PositionImpl implements Position {
	
	private int x = 0;
	private int y = 0;
	
	public PositionImpl (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}