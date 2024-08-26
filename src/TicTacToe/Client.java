package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColumnWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client  {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1, "Praveen", PlayerType.HUMAN, new Symbol('O') ) );
        players.add(new BotPlayer(2, "Bot", PlayerType.BOT, new Symbol('X'), BotDifficultyLevel.EASY) );

        Game game = gameController.startGame(
                3,
                players,
                List.of(new RowWinningStrategy(), new ColumnWinningStrategy())
        );

        // gameController.display(game);
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.display(game);
            gameController.makeMove(game);
        }

        if(gameController.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println(gameController.getWinner(game).getName() + " won the game");
        } else if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("Game results in a draw");
        }

    }
}


