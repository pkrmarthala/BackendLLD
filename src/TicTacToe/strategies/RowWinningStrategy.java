package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> counts = new HashMap<>();
    // This HashMap will exist until the object of RowWinningStrategy exist.
    // Since it is created outside of the checkWinner()

    // We can use Array of HashMap as well
    // HashMap<Character, Integer>[] = new Array();

    @Override
    public boolean checkWinner(Board board, Move move) {
        // do the algo - O(1)
        // row -> "X" -> count of that particular symbols
        // 0 -> {"X": Count}
        // 0 -> {"O": Count}
        // 1 -> {"X": Count}
        // ...
        int row = move.getCell().getRow();
        Character sym = move.getCell().getSymbol().getSym();

        // to check if there is a corresponding HashMap for that particular row.
        // check if the key of corresponding row exists in the HashMap. If not, add a new Key Value pair.
        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }

        // get the HashMap of the particular row
        HashMap<Character, Integer> countRow = counts.get(row);

        // to check if the HashMap of the countRow contains the Key.
        // updating the frequency of the symbol in the corresponding row.
        if(countRow.containsKey(sym)){
            countRow.put(sym, countRow.get(sym) + 1);
        } else {
            countRow.put(sym, 0);
        }

        // check if winner has arrived.
        if(countRow.size() == board.getSize()){ return true; }

        return false;
    }
}
