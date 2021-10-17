package ru.geekbrains.hw_ticTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class Human extends Player {

    private final char playerSymbol = CellMark.X_MARK.getSymbol();
    private Scanner scanner = new Scanner(System.in);

    public Human(String name) {
        super(name);
    }

    @Override
    public void turn(GameField gameField) {
        System.out.println("Введите координаты хода, ряд колонка:");
        int row, col;
        do {
            row = readValue();
            col = readValue();

            if (!checkRange(gameField, row) || !checkRange(gameField, col)) {
                System.out.println("Координаты должны быть в дипазоне от 1 до " + gameField.getSIZE());
                continue;
            }

            if (gameField.hasEmptyCell(row - 1, col - 1)) {
                break;
            } else {
                System.out.println("Клетка уже занята");
            }
        } while (true);

        gameField.setCell(row - 1, col - 1, playerSymbol);
        gameField.print();
        gameField.updateWinStatus(playerSymbol);
        System.out.println("--------------");
//        System.out.println(Arrays.toString(gameField.getRowPreWinCell()));
        System.out.println(Arrays.toString(gameField.getColPreWinCell()));
//        System.out.println(Arrays.toString(gameField.getDiag_1_PreWinCell()));
//        System.out.println(Arrays.toString(gameField.getDiag_2_PreWinCell()));

        System.out.println();
    }

    private int readValue() {
        while (!scanner.hasNextInt()) {
            System.out.println("Координаты должны иметь целочисленное значение");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean checkRange(GameField gameField, int index) {
        return index >= 1 && index <= gameField.getSIZE();
    }
}
