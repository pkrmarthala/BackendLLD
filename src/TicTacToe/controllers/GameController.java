package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

/* -------------------------------------------------------------------------------------------------------------- */

/* if someone else also wants to play the game, they cannot play with the same controller.
 * they have to create a new GameController object.
 *
 * When we go to a restaurant, for every new client, we will not create / generate a new waiter.
 *
 * So, it is not good to have multiple game controllers for each and every game.
 * GameController do not have any state, attributes.
 * It just takes care of calling the correct functions at the right time.
 * So, we need not create a new game controller for every game.
 *
 * The issue happened because, the game object is included in the GameController.
 */

/* -------------------------------------------------------------------------------------------------------------- */
public class GameController {
    // Game game;

    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ) {
        // validate the data that we receive from the client before we create the Game object.

        /* Validations:
         * can be put either in the Game Constructor or in the builder class.
         * 1. Check the players count == dimension - 1;
         * 2. You can have only one bot in the game.
         * 3. Every player should have a separate symbol.
         *
         * Follow the Builder Design Pattern
         */

        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public void display(Game game) {
        game.displayBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        game.undo();
    }


}
