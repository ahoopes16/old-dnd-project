package model.characters.classes;

import model.Dice;

public class MonkClass extends Class {
    public MonkClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Monk",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"None"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Shortswords"}),
            new Proficiency("Tools", new String[] {"Choose one type of artisan's tools or one musical instrument"}),
            new Proficiency("Saving Throws", new String[] {"Strength", "Dexterity"}),
            new Proficiency("Skills", new String[] {"Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth"}),
            2,
            new String[] {"Unarmored Defense", "Martial Arts"}
        );
    }
}
