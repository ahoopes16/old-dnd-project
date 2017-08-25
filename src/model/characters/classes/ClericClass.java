package model.characters.classes;

import model.Dice;

public class ClericClass extends Class {
    public ClericClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Cleric",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"Light Armor", "Medium Armor", "Shields"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Wisdom", "Charisma"}),
            new Proficiency("Skills", new String[] {"History", "Insight", "Medicine", "Persuasion", "Religion"})
        );
    }
}
