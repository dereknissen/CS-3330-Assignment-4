package hw4.maze;

import java.util.ArrayList;
import hw4.maze.Cell;

public class Row {
	
	ArrayList<Cell> row = null;

	/**
	 * Default constructor
	 * @param cells
	 */
	public Row(ArrayList<Cell> cells) {
		this.row = cells;
	}
	
	/**
	 * 
	 * @return cells in row
	 */
	public ArrayList<Cell> getCells() {
		return row;
	}

	/**
	 * Sets cell in row
	 * @param cellList
	 */
	public void setCells(ArrayList<Cell> cellList) {
		this.row = cellList;		
	}
	
	/**
	 * Converts the row to a string
	 * @return the row as a string
	 */
	public String toString() {
		String strToPrint = "Row [cells=" + this.row.toString() + "]";
		return strToPrint;
		
	}

}
