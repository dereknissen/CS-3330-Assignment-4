package hw4.player;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	
	private Row currentRow = null;
	private Cell currentCell = null;

	public Player(Row row, Cell cell) {
		this.currentRow = row;
		this.currentCell = cell;
	}

	public Object getCurrentRow() {
		return currentRow;
	}

	public Object getCurrentCell() {
		return this.currentCell;
	}
	
	public String toString() {
		return "Player [currentCell=" + this.currentCell + ", currentRow=" + this.currentRow + "]";
	}

}
