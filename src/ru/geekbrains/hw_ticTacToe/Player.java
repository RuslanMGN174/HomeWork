package ru.geekbrains.hw_ticTacToe;

public abstract class Player implements Playable {

    private String name;

    Player(String name) {
        this.name = name;
    }

    @Override
    public abstract void turn(GameField gameField);

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
