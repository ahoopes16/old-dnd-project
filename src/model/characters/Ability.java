package model.characters;

public class Ability {
    private String name = null;
    private int value = 0;
    private int modifier = 0;

    public Ability(String name, int value) {
        this.name = name;
        this.value = value;
    }

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

        //only determine modifier based on value
        modifier = (value - 10) / 2;

        if (value > 30)
            modifier = 10;
        else if (value < 2)
            modifier = -5;
    }

    public int getModifier() {
        return modifier;
    }

    public void add(Ability ab){
        if(this.name == ab.getName())
            this.value += ab.getValue();
    }
}