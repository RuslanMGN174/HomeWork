package ru.geekbrains.ticTacToe_GUI;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame{

    private JPanel centerPanel;
    private JPanel gameRootPanel;

    public GamePanel() {
        setContentPane(getGameRootPanel());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Крестики-нолики");
        setLocationRelativeTo(null);

    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public JPanel getGameRootPanel() {
        return gameRootPanel;
    }

    public void setGameRootPanel(JPanel gameRootPanel) {
        this.gameRootPanel = gameRootPanel;
    }
}
