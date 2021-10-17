package ru.geekbrains.hw_ticTacToe;

public class Game {

    static void start(GameField gameField, Computer computer, Human human) {
        while (true) {

            if (gameFieldStatusCheck(gameField.isMapFull(), "Ничья!")) break;
            human.turn(gameField);
            if (gameFieldStatusCheck(gameField.isHasWinner(), "Победил " + human.getName())) break;

            if (gameFieldStatusCheck(gameField.isMapFull(), "Ничья!")) break;
            computer.turn(gameField);
            if (gameFieldStatusCheck(gameField.isHasWinner(), "Победил " + computer.getName())) break;

        }
    }

    private static boolean gameFieldStatusCheck(boolean mapFull, String s) {
        if (mapFull) {
            System.out.println(s);
            return true;
        }
        return false;
    }
}
