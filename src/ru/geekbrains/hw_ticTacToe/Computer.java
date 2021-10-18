package ru.geekbrains.hw_ticTacToe;

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
            for (int i = 0; i < gameField.getSIZE(); i++) {
                if (gameField.hasEmptyCell(gameField.getRowPreWinCell()[0], i)) {
                    gameField.setCell(gameField.getRowPreWinCell()[0], i, computerSymbol);
                }
            }
        }

        if (gameField.getColPreWinCell() != null) {
            for (int i = 0; i < gameField.getSIZE(); i++) {
                if (gameField.hasEmptyCell(i, gameField.getColPreWinCell()[1])) {
                    gameField.setCell(i, gameField.getColPreWinCell()[1], computerSymbol);
                }
            }
        }

        if (gameField.getDiag_1_PreWinCell() != null) {
            for (int i = 0; i < gameField.getSIZE(); i++) {
                if (gameField.hasEmptyCell(i, i)) {
                    gameField.setCell(i, i, computerSymbol);
                }
            }
        }

        if (gameField.getDiag_2_PreWinCell() != null) {
            for (int i = 0; i < gameField.getSIZE(); i++) {
                if (gameField.hasEmptyCell(row, col) | ((row + col) == gameField.getSIZE() - 1)) {
                    gameField.setCell(row, col, computerSymbol);
                }
            }
        }

        gameField.setCell(row, col, computerSymbol);
        gameField.print();
        gameField.updateWinStatus(computerSymbol);
        System.out.println();
    }
}
