package hw4.game;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.player.Movement;
import hw4.player.Player;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	
	public Grid grid = null;
	
	/* Default constructor */
	public Game(Grid grid) {
		this.grid = grid;
	}
	
	/* Constructor given a size of grid */
	public Game(int dimension) {
		
		this.grid = createRandomGrid(dimension);
		
	}
	
	/* Creates a random grid */
	public Grid createRandomGrid(int dimension) {
		
		if (dimension < 3 || dimension > 7) {
	        return null;
	    }

	    Random rand = new Random();
	    int exitRow = rand.nextInt(dimension);

	    ArrayList<Row> rows = new ArrayList();
	    ArrayList<ArrayList<Cell>> gridCells = new ArrayList();

	    for (int i = 0; i < dimension; i++) {
	        ArrayList<Cell> currentRow = new ArrayList<>();
	        for (int j = 0; j < dimension; j++) {

	            CellComponents left;
	            if (j == 0) {
	                // Only one exit in the left-most column
	                left = (i == exitRow) ? CellComponents.EXIT : CellComponents.WALL;
	            } else {
	                // Share border with cell on the left
	                left = currentRow.get(j - 1).getRight();
	            }

	            CellComponents up;
	            if (i == 0) {
	                up = randToWall(rand.nextInt(2));
	            } else {
	                // Share border with cell above
	                up = gridCells.get(i - 1).get(j).getDown();
	            }

	            // Generate independent right and down borders
	            CellComponents right = randToWall(rand.nextInt(2));
	            CellComponents down = randToWall(rand.nextInt(2));

	            Cell cell = new Cell(left, right, up, down);
	            currentRow.add(cell);
	        }

	        gridCells.add(currentRow);
	        rows.add(new Row(currentRow));
	    }

	    return new Grid(rows);
	}
	
	/* Converts a random integer from an integer to a cell component */
	private CellComponents randToWall(int i) {
		if (i == 0) {
			return CellComponents.APERTURE;
		}
		if (i == 1) {
			return CellComponents.WALL;
		}
		return CellComponents.WALL;
	}

	public Object play(Movement direction, Player player) {
		
		if (player == null || direction == null) {
			return false;
		}
		if (direction == Movement.LEFT) {
			return player.moveLeft(grid);
		}
		if (direction == Movement.RIGHT) {
			return player.moveRight(grid);
		}
		if (direction == Movement.UP) {
			return player.moveUp(grid);
		}
		if (direction == Movement.DOWN) {
			return player.moveDown(grid);
		}
		
		return null;
	}

	public void setGrid(Object object) {
		this.grid = (Grid) object;
	}

	public Grid getGrid() {
		return this.grid;
	}
	
	public String toString() {
		String strToPrint = "Game [grid=" + this.grid.toString() + "]";
		return strToPrint;
	}

}
