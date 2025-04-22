package hw4.maze;

import java.util.ArrayList;

public class Row {
	
	ArrayList<Cell> row = null;

	public Row(ArrayList<Cell> cells) {
		// TODO Auto-generated constructor stub
		this.row = cells;
	}
	
	public ArrayList<Cell> getCells() {
		return row;
	}

	public void setCells(ArrayList<Cell> cellList) {
		// TODO Auto-generated method stub
		this.row = cellList;		
	}

}
