package model.characters.classes;

import model.Dice;

public abstract class Class {
    private String name;
    private Dice hitDice;
    private int baseHitPoints;
    private Proficiency armor;
    private Proficiency weapons;
    private Proficiency tools;
    private Proficiency savingThrows;
    private Proficiency skills;
}
