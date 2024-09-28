package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStrategy {
    // interface methods are by default public. So, no need to declare them as public again.
    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board, Move move);
}
