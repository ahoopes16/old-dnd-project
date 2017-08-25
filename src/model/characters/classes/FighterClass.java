package model.characters.classes;

import model.Dice;

public class FighterClass extends Class {
    public FighterClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Fighter",
            new Dice(1,10),
            10,
            new Proficiency("Armor", new String[] {"All Armor", "Shields"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Martial Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Strength", "Constitution"}),
            new Proficiency("Skills", new String[] {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival"}),
            2,
            new String[] {"Fighting Style", "Second Wind"}
        );
    }
}
