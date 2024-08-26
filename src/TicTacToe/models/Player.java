package TicTacToe.models;

import java.util.Scanner;

public abstract class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;
    private final Scanner sc = new Scanner(System.in);

    // constructor
    public Player(int id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board board) {
        System.out.println("Please enter the row where you want to place the symbol. ");
        int r = sc.nextInt();
        System.out.println("Please enter the column where you want to place the symbol. ");
        int c = sc.nextInt();
        // the entered r and c may not be pointing to a correct position.
        // Validating here will need multiple parameters.
        // So, once the player makes the move, the game will validate it.
        return new Move(new Cell(r, c), this); // this refers to the player that has called this function.
    }

}
