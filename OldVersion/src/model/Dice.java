package model;

import java.util.Random;

public class Dice {
    private int sides;
    private int count;

    public Dice(int count, int sides) {
        this.count = count;
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int roll() {
        Random dice =  new Random();
        int total = 0;
        for( int i = 0; i < count; i++){
            total += dice.nextInt(sides) + 1;
        }
        return total;
    }

    @Override
    public String toString() {
        return count + "d" + sides;
    }
}
