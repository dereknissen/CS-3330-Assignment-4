package hw4.maze;

import java.util.ArrayList;

public class Grid {
	
	private ArrayList<Row> rows = new ArrayList<>();
	
	public Grid(ArrayList<Row> rows2) {
		// TODO Auto-generated constructor stub
		this.rows = rows2;
	}

	public ArrayList<Row> getRows() {
        return this.rows;
    }

	public void setRows(Object object) {
		// TODO Auto-generated method stub
		this.rows = (ArrayList<Row>) object;
	}

	
	
}
