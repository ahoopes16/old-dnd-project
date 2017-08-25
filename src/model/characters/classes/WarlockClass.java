package model.characters.classes;

import model.Dice;

public class WarlockClass extends Class {
    public WarlockClass(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools, Proficiency savingThrows, Proficiency skills) {
        super(
            "Warlock",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"Light Armor"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Wisdom", "Charisma"}),
            new Proficiency("Skills", new String[] {"Arcana", "Deception", "History", "Intimidation", "Investigation", "Nature", "Religion"}),
            2,
            new String[] {"Otherworldly Patron", "Pact Magic"}
        );
    }
}
