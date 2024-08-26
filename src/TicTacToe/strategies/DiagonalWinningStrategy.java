package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        HashMap<Integer, HashMap<Character, Integer>> counts= new HashMap<>();

        // int
        // do the algo
        return false;
    }
}
