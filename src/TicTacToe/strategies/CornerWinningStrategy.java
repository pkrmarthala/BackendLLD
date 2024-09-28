package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public class CornerWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        // do the algo here
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }


}
