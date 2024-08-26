package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character, Integer>> counts = new HashMap<>();


    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Character sym = move.getCell().getSymbol().getSym();

        // check if the key of corresponding column exists in the HashMap. If not, add a new Key Value pair.
        if (!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }

        // get the HashMap of that particular column
        HashMap<Character, Integer> countCol = counts.get(col);

        // check if the symbol is present in the col HashMap.
        // Increase the frequency if present.
        if (countCol.containsKey(sym)) {
            countCol.put(sym, countCol.get(sym) + 1);
        } else { // Initialize to 1 if not present and its the first time that sym is encountered.
            countCol.put(sym, 1);
        }

        if(countCol.get(sym) == board.getSize()) { return true; }
        return false;
    }
}
