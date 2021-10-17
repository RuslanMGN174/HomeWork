package ru.geekbrains.hw_ticTacToe;

public class Player implements Playable{

    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public void turn(GameField gameField) {

    }
}
