package ru.geekbrains.hw_ticTacToe;

import java.util.Arrays;

public class GameField {

    private int SIZE;
    private int WINSTREAK;

    private int[] rowPreWinCell;
    private int[] colPreWinCell;
    private int[] diag_1_PreWinCell;
    private int[] diag_2_PreWinCell;

    private char[][] gameField;
    private boolean hasWinner;
    private final char emptySymbol = CellMark.EMPTY_MARK.getSymbol();


    public GameField(int size, int winStreak) {
        SIZE = size;
        WINSTREAK = winStreak;
    }

    private void init() {
        gameField = new char[getSIZE()][getSIZE()];

        for (char[] chars : gameField) {
            Arrays.fill(chars, emptySymbol);
        }
    }

    void build() {
        init();
        printGameFieldHeader();
        printGameFieldState();
    }

    void print() {
        printGameFieldHeader();
        printGameFieldState();
    }

    boolean hasEmptyCell(int row, int col) {
        return gameField[row][col] == emptySymbol;
    }

    boolean isMapFull() {
        for (int row = 0; row < getSIZE(); row++) {
            for (int col = 0; col < getSIZE(); col++) {
                if (hasEmptyCell(row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    void updateWinStatus(char symbol) {
        setHasWinner(isDiagonalHasWinStreak(symbol) || isWinByCol(symbol) || isWinByRow(symbol));
    }

    private boolean isWinByRow(char symbol) {
        for (int i = 0; i < getWINSTREAK(); i++) {
            if (isRowHasWinStreak(symbol, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinByCol(char symbol) {
        for (int i = 0; i < getWINSTREAK(); i++) {
            if (isColHasWinStreak(symbol, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRowHasWinStreak(char symbol, int row) {
        int count = 0;
        for (int col = 0; col < getSIZE(); col++) {
            if (gameField[row][col] == symbol) {
                count++;
            }
            if (count == getWINSTREAK() - 1) {
                setRowPreWinCell(new int[]{row, col});
            }

        }
        return count == getWINSTREAK();
    }

    private boolean isColHasWinStreak(char symbol, int col) {
        int count = 0;
        for (int row = 0; row < getSIZE(); row++) {
            if (gameField[row][col] == symbol) {
                count++;
            }
            if (count == getWINSTREAK() - 1) {
                setColPreWinCell(new int[]{row, col});
            }
        }
        return count == getWINSTREAK();
    }

    private boolean isDiagonalHasWinStreak(char symbol) {
        int diagCount_1 = 0;
        int diagCount_2 = 0;
        for (int row = 0; row < getSIZE(); row++) {
            for (int col = 0; col < getSIZE(); col++) {
                if (row == col) {
                    if (gameField[row][col] == symbol) {
                        diagCount_1++;
                    }
                    if (diagCount_1 == getWINSTREAK() - 1) {
                        setDiag_1_PreWinCell(new int[]{row, col});
                    }
                }
                if ((row + col) == getSIZE() - 1) {
                    if (gameField[row][col] == symbol) {
                        diagCount_2++;
                    }
                    if (diagCount_2 == getWINSTREAK() - 1) {
                        setDiag_2_PreWinCell(new int[]{row, col});
                    }
                }
            }
        }
        return diagCount_1 == getWINSTREAK() || diagCount_2 == getWINSTREAK();
    }

    private void printGameFieldState() {
        for (int i = 0; i < gameField.length; i++) {
            printRowNumber(i);
            printRow(gameField[i]);
            System.out.println();
        }
    }

    private void printGameFieldHeader() {
        for (int i = 0; i <= getSIZE(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void printRow(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
    }

    private void printRowNumber(int rowNumber) {
        System.out.print(rowNumber + 1 + " ");
    }

    void setCell(int row, int col, char symbol) {
        this.gameField[row][col] = symbol;
    }

    int getSIZE() {
        return SIZE;
    }

    int getWINSTREAK() {
        return WINSTREAK;
    }

    boolean isHasWinner() {
        return hasWinner;
    }

    void setHasWinner(boolean hasWinner) {
        this.hasWinner = hasWinner;
    }

    int[] getRowPreWinCell() {
        return rowPreWinCell;
    }

    private void setRowPreWinCell(int[] rowPreWinCell) {
        this.rowPreWinCell = rowPreWinCell;
    }

    int[] getColPreWinCell() {
        return colPreWinCell;
    }

    private void setColPreWinCell(int[] colPreWinCell) {
        this.colPreWinCell = colPreWinCell;
    }

    int[] getDiag_1_PreWinCell() {
        return diag_1_PreWinCell;
    }

    private void setDiag_1_PreWinCell(int[] diag_1_PreWinCell) {
        this.diag_1_PreWinCell = diag_1_PreWinCell;
    }

    int[] getDiag_2_PreWinCell() {
        return diag_2_PreWinCell;
    }

    private void setDiag_2_PreWinCell(int[] diag_2_PreWinCell) {
        this.diag_2_PreWinCell = diag_2_PreWinCell;
    }
}
