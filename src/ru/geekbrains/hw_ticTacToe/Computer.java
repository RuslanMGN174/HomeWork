package ru.geekbrains.hw_ticTacToe;

import java.util.Arrays;

public class Computer extends Player {

    private final char computerSymbol = CellMark.O_MARK.getSymbol();
    private final char playerSymbol = CellMark.O_MARK.getSymbol();

    public Computer(String name) {
        super(name);
    }

    @Override
    public void turn(GameField gameField) {
        int row, col;
        do {
            row = (int) (Math.random() * gameField.getSIZE());
            col = (int) (Math.random() * gameField.getSIZE());
        } while (!gameField.hasEmptyCell(row, col));

        //Блокировка хода пользователя, если он побеждает на следующем ходу
        if (gameField.getRowPreWinCell() != null) {
            do {
                col = (int) (Math.random() * gameField.getSIZE());
            } while (!gameField.hasEmptyCell(gameField.getRowPreWinCell()[0], col));
            System.out.println(gameField.getRowPreWinCell()[0] + " " + col);
            gameField.setCell(gameField.getRowPreWinCell()[0], col, computerSymbol);
        }

        if (gameField.getColPreWinCell() != null) {
            do {
                row = (int) (Math.random() * gameField.getSIZE());
            } while (!gameField.hasEmptyCell(row, gameField.getColPreWinCell()[1]));
            System.out.println(row + " " + gameField.getColPreWinCell()[1]);
            gameField.setCell(row, gameField.getColPreWinCell()[1], computerSymbol);
        }

        if (gameField.getDiag_1_PreWinCell() != null) {
            do {
                row = col = (int) (Math.random() * gameField.getSIZE());
            } while (!gameField.hasEmptyCell(row, col));
            gameField.setCell(row, col, computerSymbol);
        }

        if (gameField.getDiag_2_PreWinCell() != null) {
            do {
                row = (int) (Math.random() * gameField.getSIZE());
                col = (int) (Math.random() * gameField.getSIZE());
            } while (!gameField.hasEmptyCell(row, col) | ((row + col) != gameField.getSIZE() - 1));
            gameField.setCell(row, col, computerSymbol);
        }

        gameField.setCell(row, col, computerSymbol);
        gameField.print();
        gameField.updateWinStatus(computerSymbol);

        System.out.println();
    }
}
