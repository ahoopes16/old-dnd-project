package model.characters;

public class Ability {
    private String name = null;
    private int value = 0;
    private int modifier = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

        modifier = (value - 10) / 2;

        if (value > 20)
            modifier = 5;
        else if (value < 0)
            modifier = -5;
    }

    public int getModifier() {
        return modifier;
    }
}