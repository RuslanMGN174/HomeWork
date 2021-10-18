package ru.geekbrains.hw_ticTacToe;

public class Game {

    static void start(GameField gameField, Player player1, Player player2) {
        while (true) {

            if (isDraw(gameField)) break;
            player2.turn(gameField);
            if (isWin(gameField, player2)) break;

            if (isDraw(gameField)) break;
            player1.turn(gameField);
            if (isWin(gameField, player1)) break;

        }
    }

    private static boolean isWin(GameField gameField, Player player) {
        return gameFieldStatusCheck(gameField.isHasWinner(), "Победил " + player.getName());
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
