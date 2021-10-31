package ru.geekbrains.ticTacToe_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField implements ActionListener {

    private int SIZE;
    private int WINSTREAK;

    private final Icon computerSymbol = new ImageIcon("E:\\Java\\Geekbrains\\Chapter1\\HomeWork\\res\\" + "O_Mark.png");
    private final Icon playerSymbol = new ImageIcon("E:\\Java\\Geekbrains\\Chapter1\\HomeWork\\res\\" + "X_Mark.png");

    private JButton[][] gameArea;
    private JButton clickedButton;
    private boolean hasWinner;

    private GamePanel gamePanel;

    public GameField(int size) {
        SIZE = size;
        WINSTREAK = size;
    }

    public void init() {

        gamePanel = new GamePanel();
        gamePanel.setBounds(300, 300, SIZE * 100, SIZE * 100);
        gamePanel.setLayout(new GridLayout(SIZE, SIZE));
        gameArea = new JButton[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameArea[i][j] = new JButton();
                gameArea[i][j].addActionListener(this);
                gamePanel.add(gameArea[i][j]);
            }
        }
        gamePanel.setVisible(true);

    }

    boolean hasEmptyCell(int row, int col) {
        return gameArea[row][col].getIcon() == null;
    }

    boolean isMapFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (hasEmptyCell(row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    void updateWinStatus(Icon symbol) {
        setHasWinner(isDiagonalHasWinStreak(symbol) || isWinByCol(symbol) || isWinByRow(symbol));
    }

    private boolean isWinByRow(Icon symbol) {
        for (int i = 0; i < WINSTREAK; i++) {
            if (isRowHasWinStreak(symbol, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinByCol(Icon symbol) {
        for (int i = 0; i < WINSTREAK; i++) {
            if (isColHasWinStreak(symbol, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRowHasWinStreak(Icon symbol, int row) {
        int count = 0;
        for (int col = 0; col < SIZE; col++) {
            if (gameArea[row][col].getIcon() == symbol) {
                count++;
            }
        }
        return count == WINSTREAK;
    }

    private boolean isColHasWinStreak(Icon symbol, int col) {
        int count = 0;
        for (int row = 0; row < SIZE; row++) {
            if (gameArea[row][col].getIcon() == symbol) {
                count++;
            }
        }
        return count == WINSTREAK;
    }

    private boolean isDiagonalHasWinStreak(Icon symbol) {
        int diagCount_1 = 0;
        int diagCount_2 = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (row == col) {
                    if (gameArea[row][col].getIcon() == symbol) {
                        diagCount_1++;
                    }
                }
                if ((row + col) == SIZE - 1) {
                    if (gameArea[row][col].getIcon() == symbol) {
                        diagCount_2++;
                    }
                }
            }
        }
        return diagCount_1 == WINSTREAK || diagCount_2 == WINSTREAK;
    }

    void setCell(int row, int col, Icon symbol) {
        this.gameArea[row][col].setIcon(symbol);
    }

    boolean isHasWinner() {
        return hasWinner;
    }

    void setHasWinner(boolean hasWinner) {
        this.hasWinner = hasWinner;
    }

    private void aiTurn() {
        int row, col;
        do {
            row = (int) (Math.random() * SIZE);
            col = (int) (Math.random() * SIZE);
        } while (!hasEmptyCell(row, col));

        setCell(row, col, computerSymbol);
        System.out.println();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isMapFull()) {
            clickedButton = (JButton) e.getSource();
            if (clickedButton.getIcon() == null) {
                clickedButton.setIcon(playerSymbol);
            }

            updateWinStatus(playerSymbol);
            if (isHasWinner()) {
                showMessage("Вы победили");
            }
        } else {
            showMessage("Ничья");

        }

        if (!isMapFull()) {
            aiTurn();
            updateWinStatus(computerSymbol);
            if (isHasWinner()) {
                showMessage("Вы проиграли");
            }
        } else {
            showMessage("Ничья");
        }
    }

    private void showMessage(String s) {
        JOptionPane.showMessageDialog(gamePanel.getGameRootPanel(), s);
        System.exit(1);
    }
}
