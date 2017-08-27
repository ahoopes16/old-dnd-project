package model.characters.races;

import model.characters.Ability;

public abstract class Race {
    private String name;
    private int speed;
    private Ability[] abilityMods;
    private String[] feats;

    public Race(String name, int speed, Ability[] abilityMods, String[] feats) {
        this.name = name;
        this.speed = speed;
        this.abilityMods = abilityMods;
        this.feats = feats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Ability[] getAbilityMods() {
        return abilityMods;
    }

    public void setAbilityMods(Ability[] abilityMods) {
        this.abilityMods = abilityMods;
    }

    public String[] getFeats() {
        return feats;
    }

    public void setFeats(String[] feats) {
        this.feats = feats;
    }
}

