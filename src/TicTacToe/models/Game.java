package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Player> players;
    private List<WinningStrategy> winningStrategies;
    private Player winner;
    private int nextPlayerIndex; // int flag
    private List<Move> moves;
    private GameState gameState;

    private Game(Builder builder) {
        this.board = new Board(builder.dimension);
        this.players = builder.players;
        this.winningStrategies = builder.winningStrategies;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
    }

    /* -------------------------------------------------------------------------------------------------------------- */
    /* Out of all the above attributes, we need three properties from the client.
     * 1. Board dimension
     * 2. List<Players>
     * 3. List<WinningStrategy>
     * */


    // getters and setters for above properties:
    // The getters and setters should be public for free access

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }


    public static Builder getBuilder() {
        return new Builder();
    }

    public void displayBoard() { // This will generally go into a service
        board.display();
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    // inner class for Builder Design Pattern
    public static class Builder { // only attributes that we want from the client.
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        // setters alone for the Builder class, which will retuen the Builders.
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public void validate() {
            // Validations:
            // 1. Check the players count == dimension - 1;
            if(players.size() != dimension - 1 ) {
                throw new RuntimeException("Invalid players count!");
            }
            // 2. You can have only one bot in the game.
            int botCount = 0;
            for(Player player : players) {
                if(player.getPlayerType().equals(PlayerType.BOT)) { botCount++; }
            }
            if(botCount > 1) { throw new RuntimeException("More than one bot is not allowed!"); }

            // 3. Every player should have a separate symbol.
            Set<Character> symbolSet = new HashSet<>();
            for(Player player : players) {
                if( symbolSet.contains(player.getSymbol().getSym()) ) {
                    throw new RuntimeException("Multiple players have the same Symbol!");
                }
                symbolSet.add(player.getSymbol().getSym());
            }

        }

        public Game build() {
            /* Validations:
             * can be put either in the Game Constructor or here in the builder class.
             * 1. Check the players count == dimension - 1;
             * 2. You can have only one bot in the game.
             * 3. Every player should have a separate symbol.
             *
             * If we set the validations here, SRP will be violated, and the code also will become clumsy.
             * Hence, create a separate method.
             */
            validate();
            return new Game(this);
        }
    }

}
