package ru.geekbrains.hw_ticTacToe;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final int WIN_STREAK = 3;
    private static final GameField gameField = new GameField(SIZE, WIN_STREAK);
    private static final Human human = new Human();
    private static final Computer computer = new Computer();

    public static void main(String[] args) {
        gameField.build();

        while (!gameField.isHasWinner() || gameField.isMapFull()) {
            human.turn(gameField);
            computer.turn(gameField);
        }

    }
}
