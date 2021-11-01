package ru.geekbrains.ticTacToe_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPanel extends JFrame {

    private JPanel menuRootPanel;
    private JPanel centerPanel;
    private JPanel menuPanel;
    private JLabel _3x3;
    private JLabel _5x5;

    MenuPanel() {
        setContentPane(getMenuRootPanel());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(210, 210);
        setTitle("Крестики-нолики");
        setLocationRelativeTo(null);
        setBounds(300, 300, 300, 300);
        setVisible(true);

        fieldSizeLabelStyle();

        _3x3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                GameField gameField = new GameField(3);
                gameField.init();
            }
        });

        _5x5.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                GameField gameField = new GameField(5);
                gameField.init();
            }
        });
    }

    private void fieldSizeLabelStyle() {
        fieldSizeLabelColor(_3x3);
        fieldSizeLabelColor(_5x5);
    }

    private void fieldSizeLabelColor(JLabel label) {
        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(new Color(216, 49, 49, 235));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(new Color(3, 3, 3, 255));
            }
        });
    }

    public JPanel getMenuRootPanel() {
        return menuRootPanel;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public JLabel get_3x3() {
        return _3x3;
    }

    public JLabel get_5x5() {
        return _5x5;
    }
}


