package ru.geekbrains.hw_ticTacToe;

public class Game {

    static void start(GameField gameField, Player player1, Player player2) {
        while (true) {

            if (isDraw(gameField)) break;
            player2.turn(gameField);
            if (gameFieldStatusCheck(gameField.isHasWinner(), "Победил " + player2.getName())) break;

            if (isDraw(gameField)) break;
            player1.turn(gameField);
            if (gameFieldStatusCheck(gameField.isHasWinner(), "Победил " + player1.getName())) break;

        }
    }

    private static boolean isDraw(GameField gameField) {
        return gameFieldStatusCheck(gameField.isMapFull(), "Ничья!");
    }

    private static boolean gameFieldStatusCheck(boolean mapFull, String s) {
        if (mapFull) {
            System.out.println(s);
            return true;
        }
        return false;
    }
}
