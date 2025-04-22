package hw4.maze;

public class Cell {
	CellComponents up = null;
	CellComponents down = null;
	CellComponents left = null;
	CellComponents right = null;
	
	/* Default constructor */
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.left = (left!=null) ? left : CellComponents.WALL;
		this.right = (right!=null) ? right : CellComponents.WALL;
		this.up = (up!=null) ? up : CellComponents.WALL;
		this.down = (down!=null) ? down : CellComponents.WALL;
	}
	
	
	/* Getters and setters */
	public CellComponents getUp() {
		return up;
	}
	public void setUp(CellComponents up) {
		this.up = (up!=null) ? up : CellComponents.WALL;
	}
	public CellComponents getDown() {
		return down;
	}
	public void setDown(CellComponents down) {
		this.down = (down!=null) ? down : CellComponents.WALL;
	}
	public CellComponents getLeft() {
		return left;
	}
	public void setLeft(CellComponents left) {
		this.left = (left!=null) ? left: CellComponents.WALL;
	}
	public CellComponents getRight() {
		return right;
	}
	public void setRight(CellComponents right) {
		this.right = (right!=null) ? right : CellComponents.WALL;
	}
	
	public String toString() {
		return "Cell [left=" + this.getLeft() + ", right=" + this.getRight() + ", up=" + this.getUp() + ", down=" + this.getDown() + "]";
	}
	
	
}
