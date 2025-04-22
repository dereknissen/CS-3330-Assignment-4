package hw4.player;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;

public class Player {
	
	private Row currentRow = null;
	private Cell currentCell = null;
	
	/**
	 * Default constructor
	 * @param row
	 * @param cell
	 */
	public Player(Row row, Cell cell) {
		this.currentRow = row;
		this.currentCell = cell;
	}

	/**
	 * 
	 * @return the players current row
	 */
	public Object getCurrentRow() {
		return currentRow;
	}
	
	/**
	 * 
	 * @return the players current cell
	 */
	public Object getCurrentCell() {
		return this.currentCell;
	}
	
	/**
	 * Converts the players current position to a string
	 * @return the players position as a string
	 */
	public String toString() {
		return "Player [currentCell=" + this.currentCell + ", currentRow=" + this.currentRow + "]";
	}
	
	/**
	 * Moves the player left along the grind
	 * @param grid
	 * @return true when movement happens and false otherwise
	 */
	public Boolean moveLeft(Grid grid) {
		
		int currentIndex = currentRow.getCells().indexOf(currentCell);
		
		/* If the left wall is a hole, then continue moving left */
		if (currentCell.getLeft() == CellComponents.APERTURE) {
			this.currentCell = currentRow.getCells().get(currentIndex-1);
			grid.printCells(this);
			return true;
		}
		
		/* In case the agent is reaching the exit */
		if (currentCell.getLeft() == CellComponents.EXIT) {
			System.out.println("line 43");
//			this.currentCell = currentRow.getCells().get(currentIndex-1);
			grid.printCells(this);
			return true;
		}
		
		/* Wall is solid */
		return false;
	}
	
	/**
	 * Moves the player right along the grid
	 * @param grid
	 * @return true when movement happens and false otherwise
	 */
	public Boolean moveRight(Grid grid) {
		
		int currentIndex = currentRow.getCells().indexOf(currentCell);
		
		
		/* If not on the right-most cell */
		if (currentIndex < currentRow.getCells().size() - 1) {
			/* If the right wall is a hole, then continue moving right */
			if (currentCell.getRight() == CellComponents.APERTURE) {
				/* move left */
				this.currentCell = currentRow.getCells().get(currentIndex+1);
				grid.printCells(this);
				return true;
			}
		}
		
		/* Wall is solid */
		return false;
	}
	
	/**
	 * Moves the player up along the grid
	 * @param grid
	 * @return true when movement happens and false otherwise
	 */
	public Boolean moveUp(Grid grid) {
		
		int currentIndex = currentRow.getCells().indexOf(currentCell);
		int rowNum = grid.getRows().indexOf(currentRow);
		
		/* If not on the top row */
		if (rowNum != 0) {
			/* If there is a hole on the top wall */
			if (currentCell.getUp() == CellComponents.APERTURE) {
				this.currentRow = grid.getRows().get(rowNum - 1);
				this.currentCell = this.currentRow.getCells().get(currentIndex);
				grid.printCells(this);
				return true;
			}
		} 
		
		/* Wall is solid */
		return false;
	}
	
	/**
	 * Moves the player down along the grid
	 * @param grid
	 * @return true when movement happens and false otherwise
	 */
	public Boolean moveDown(Grid grid) {
		
		int currentIndex = currentRow.getCells().indexOf(currentCell);
		int rowNum = grid.getRows().indexOf(currentRow);
		
		/* If not on the bottom row */
		if (rowNum < grid.getRows().size() - 1) {
			/* If there is a hole on the top wall */
			if (currentCell.getUp() == CellComponents.APERTURE) {
				this.currentRow = grid.getRows().get(rowNum + 1);
				this.currentCell = this.currentRow.getCells().get(currentIndex);
				grid.printCells(this);
				return true;
			}
		}
		
		/* Wall is solid */
		return false;
	}
	

}
