package model.characters.classes;

import model.Dice;

public class SorcererClass extends Class {
    public SorcererClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Sorcerer",
            new Dice(1,6),
            6,
            new Proficiency("Armor", new String[] {"None"}),
            new Proficiency("Weapons", new String[]{"Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbow"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Constitution", "Charisma"}),
            new Proficiency("Skills", new String[] {"Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion"})
        );
    }
}
