package model;

import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random dice =  new Random();
        return (dice.nextInt(sides) + 1);

    }
}
