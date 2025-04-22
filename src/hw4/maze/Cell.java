package hw4.maze;

public class Cell {
	CellComponents up = null;
	CellComponents down = null;
	CellComponents left = null;
	CellComponents right = null;
	
	/**
	 * Default constructor
	 * @param left
	 * @param right
	 * @param up
	 * @param down
	 */
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.left = (left!=null) ? left : CellComponents.WALL;
		this.right = (right!=null) ? right : CellComponents.WALL;
		this.up = (up!=null) ? up : CellComponents.WALL;
		this.down = (down!=null) ? down : CellComponents.WALL;
	}
	
	
	/**
	 * 
	 * @return the up cell component
	 */
	public CellComponents getUp() {
		return up;
	}
	
	/**
	 * Sets the up cell component
	 * @param up
	 */
	public void setUp(CellComponents up) {
		this.up = (up!=null) ? up : CellComponents.WALL;
	}
	
	/**
	 * 
	 * @return the down cell component
	 */
	public CellComponents getDown() {
		return down;
	}
	
	/**
	 * Sets the down cell component
	 * @param down
	 */
	public void setDown(CellComponents down) {
		this.down = (down!=null) ? down : CellComponents.WALL;
	}
	
	/**
	 * 
	 * @return the left cell component
	 */
	public CellComponents getLeft() {
		return left;
	}
	
	/**
	 * Sets the left cell component
	 * @param left
	 */
	public void setLeft(CellComponents left) {
		this.left = (left!=null) ? left: CellComponents.WALL;
	}
	
	/**
	 * 
	 * @return the right cell component
	 */
	public CellComponents getRight() {
		return right;
	}
	
	/**
	 * Sets the right cell component
	 * @param right
	 */
	public void setRight(CellComponents right) {
		this.right = (right!=null) ? right : CellComponents.WALL;
	}
	
	/**
	 * Converts the cell to a string
	 * @return the cell as a string
	 */
	public String toString() {
		return "Cell [left=" + this.getLeft() + ", right=" + this.getRight() + ", up=" + this.getUp() + ", down=" + this.getDown() + "]";
	}
	
	
}
