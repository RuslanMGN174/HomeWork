package ru.geekbrains.hw_ticTacToe;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final int WIN_STREAK = 3;
    private static final GameField gameField = new GameField(SIZE, WIN_STREAK);
    private static final Player player1 = new Computer("AI");
    private static final Player player2 = new Human("Unnamed");


    public static void main(String[] args) {
        gameField.build();
        Game.start(gameField, player1, player2);
    }
}
