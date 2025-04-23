package hw4.simulation;

import hw4.game.Game;
import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.player.Movement;
import hw4.player.Player;

public class Simulation {
    public static void main(String[] args) {
        /* Create game with 5x5 grid */
        Game game = new Game(5);
        Grid grid = game.getGrid();

        /* Put player at bottom right (row 4, col 4) */
        int rowNum = 4;
        int colNum = 4;
        Row startRow = grid.getRows().get(rowNum);
        Cell startCell = startRow.getCells().get(colNum);
        Player player = new Player(startRow, startCell);

        /* Show starting grid */
        System.out.println("Starting Grid:");
        grid.printCells(player);

        /* List of moves to try */
        Movement[] moves = {
            Movement.UP,
            Movement.LEFT,
            Movement.UP,
            Movement.LEFT,
            Movement.DOWN,
            Movement.LEFT,
            Movement.UP,
            Movement.LEFT,
            Movement.DOWN,
            Movement.LEFT,
            Movement.UP,
            Movement.LEFT,
            Movement.LEFT,
            Movement.RIGHT,
            Movement.DOWN
        };
        
        /* Try each move */
        for (int i = 0; i < moves.length; i++) {
            Movement move = moves[i];
            System.out.println("Trying to go " + move + ":");
            
        	game.play(move, player);

            Cell currentCell = (Cell)player.getCurrentCell();
            if (move == Movement.LEFT && currentCell.getLeft() == CellComponents.EXIT) {
                System.out.println("You escaped!");
                break;
            }
            else {
            	System.out.println("Hit a wall or edge.");
            }
        }
    }
}