package ru.geekbrains.hw_ticTacToe;

import java.util.Arrays;

public class GameField {

    private static int SIZE;
    private int WINSTREAK;
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

    void winCheck (char symbol) {
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
        }
        return count == getWINSTREAK();
    }

    private boolean isColHasWinStreak(char symbol, int col) {
        int count = 0;
        for (int row = 0; row < getSIZE(); row++) {
            if (gameField[row][col] == symbol) {
                count++;
            }
        }
        return count == getWINSTREAK();
    }

    boolean isDiagonalHasWinStreak(char symbol) {
        int diagStreak_1 = 0;
        int diagStreak_2 = 0;
        for (int row = 0; row < getSIZE(); row++) {
            for (int col = 0; col < getSIZE(); col++) {
                if (row == col) {
                    if (gameField[row][col] == symbol) {
                        diagStreak_1++;
                    }
                }
                if ((row + col) == getSIZE() - 1) {
                    if (gameField[row][col] == symbol) {
                        diagStreak_2++;
                    }
                }
            }
        }
        return diagStreak_1 == getWINSTREAK() || diagStreak_2 == getWINSTREAK();
    }

    private char getColSymbol(int colNumber) {
        return ' ';
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


    public void setCell(int row, int col, char symbol) {
        this.gameField[row][col] = symbol;
    }

    static int getSIZE() {
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
}
