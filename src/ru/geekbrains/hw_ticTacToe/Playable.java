package ru.geekbrains.hw_ticTacToe;

public interface Playable {

    void turn(GameField gameField);
//    void printWinner(GameField gameField);

//    default void drawCheck(GameField gameField) {
//        if (gameField.isMapFull()) {
//            System.out.println("------");
//            System.out.println("Ничья!");
//            System.out.println("------");
//        }
//    }

}
