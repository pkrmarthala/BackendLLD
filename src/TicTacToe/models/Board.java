package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size; // size of the board
    private List<List<Cell>> grid; // 2D Array (matrix) of Cells

    public Board(int dimension) {
        this.size = dimension;
        this.grid = new ArrayList<>();
        for(int i = 0; i < dimension; i++) {
            grid.add(new ArrayList<>()); // adding empty arraylist for each row.
            for(int j = 0; j < dimension; j++) {
                grid.get(i).add(new Cell(i, j)); // adding a new cell at each empty cell
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void display() { // This will generally go into a service
        for(List<Cell> row : grid) {
            for(Cell cell : row) {
                cell.display();
            }
            System.out.println();
        }
    }
}
