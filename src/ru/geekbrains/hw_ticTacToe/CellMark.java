package ru.geekbrains.hw_ticTacToe;

enum CellMark {
    X_MARK('X'),
    O_MARK('0'),
    EMPTY_MARK('•');

    private char symbol;

    CellMark(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}