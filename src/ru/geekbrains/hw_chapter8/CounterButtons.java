package ru.geekbrains.hw_chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterButtons {

    private static int counter = 0;
    private static int counterStep = 1;
    private static JLabel counterValueView;

    public static void main(String[] args) {
        JFrame mainFrame = initFrame();


        Font font = new Font("Arial", Font.BOLD, 32);


        createCounterView(mainFrame, font);
        createButtons(mainFrame, font);
        createTextField(mainFrame);

        mainFrame.setVisible(true);
    }

    private static void createButtons(JFrame mainFrame, Font font) {
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        mainFrame.add(decrementButton, BorderLayout.LINE_START);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        mainFrame.add(incrementButton, BorderLayout.LINE_END);

        decrementButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                counterValueView.setText(String.valueOf(counter -= counterStep));
            }
        });
        incrementButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                counterValueView.setText(String.valueOf(counter += counterStep));
            }
        });

    }

    private static int readValue(JTextField textField, JFrame mainFrame) {

        while (!textField.getText().matches("[-+]?\\d+")) {
            JOptionPane.showMessageDialog(mainFrame.getContentPane(), "Введите целочисленное значение");
        }
        return Integer.parseInt(textField.getText());
    }


    private static void createTextField(JFrame mainFrame) {
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        mainFrame.add(textPanel, BorderLayout.NORTH);

        JLabel textLabel = new JLabel();
        textLabel.setText("Укажите шаг счетчика:");
        textPanel.add(textLabel, BorderLayout.WEST);

        JTextField stepValue = new JTextField();
        textPanel.add(stepValue, BorderLayout.CENTER);
        stepValue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stepValue.getText().equals("")) {
                    counterStep = readValue(stepValue, mainFrame);
                    System.out.println(readValue(stepValue, mainFrame));
                }
            }
        });
    }

    private static JFrame initFrame() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Counter");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(300, 300, 400, 200);
        return mainFrame;
    }

    private static void createCounterView(JFrame mainFrame, Font font) {
        counterValueView = new JLabel(getCounterValueAsText());
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setFont(font);
        mainFrame.add(counterValueView, BorderLayout.CENTER);
    }

    private static String getCounterValueAsText() {
        return String.valueOf(counter);
    }
}

