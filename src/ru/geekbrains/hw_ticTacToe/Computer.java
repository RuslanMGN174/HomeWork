package ru.geekbrains.hw_ticTacToe;

public class Computer implements Playable{

    private final char computerSymbol = CellMark.O_MARK.getSymbol();

    @Override
    public void turn(GameField gameField) {
        int row, col;
        do {
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
        } while (!gameField.hasEmptyCell(row, col));

        gameField.setCell(row,col, computerSymbol);
        gameField.winCheck(computerSymbol);
        gameField.print();
        drawCheck(gameField);

        System.out.println();


//        gameField.getRowSymbol(CellMark.O_MARK.getSymbol());

    }

    public void printWinner(GameField gameField){
    }


    private boolean isCellEmpty(GameField gameField, int row, int col) {
        return gameField.hasEmptyCell(row, col);
    }
}
