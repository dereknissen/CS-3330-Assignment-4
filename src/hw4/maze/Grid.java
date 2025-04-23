package hw4.maze;

import java.util.ArrayList;
import hw4.player.Player;

public class Grid {
	
	private ArrayList<Row> rows = new ArrayList<>();
	
	/**
	 * Default constructor
	 * @param rows2
	 */
	public Grid(ArrayList<Row> rows2) {
		this.rows = rows2;
	}

	/**
	 * 
	 * @return the rows of the grid
	 */
	public ArrayList<Row> getRows() {
        return this.rows;
    }

	/**
	 * Sets the rows of the grid
	 * @param object
	 */
	public void setRows(Object object) {
		this.rows = (ArrayList<Row>) object;
	}

	/**
	 * Turns the grid into a string
	 * @return a string representation of the grid
	 */
	public String toString() {
		String strToPrint = "Grid [rows=" + this.rows.toString() + "]";
		return strToPrint;
	}
	
	/**
	 * Prints the cells of the grid with player location
	 * @param player
	 */
	public void printCells(Player player) {
		for (var i = 0; i < rows.size(); i++) { // For each row
			String rowStr = "";
			for (var z = 0; z < rows.size(); z++) {
				String cellStr = "S";
				Cell currentCell = rows.get(i).getCells().get(z);
				
				if (currentCell.getLeft() == CellComponents.EXIT) {
					cellStr = "E";
				}
				
				if (currentCell == player.getCurrentCell()) {
					cellStr = "A";
				}
				
				rowStr+=cellStr;
			}
			System.out.println(rowStr);
		}
		System.out.println("");
	}
	
}
