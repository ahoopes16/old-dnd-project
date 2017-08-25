package model.characters.classes;

import model.Dice;

public class PaladinClass extends Class {
    public PaladinClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Paladin",
            new Dice(1,10),
            10,
            new Proficiency("Armor", new String[] {"All Armor", "Shields"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Martial Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Wisdom", "Charisma"}),
            new Proficiency("Skills", new String[] {"Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion"})
        );
    }
}
