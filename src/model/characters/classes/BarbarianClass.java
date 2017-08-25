package model.characters.classes;

import model.Dice;

public class BarbarianClass extends Class {
    public BarbarianClass() {
        super(
            "Barbarian",
            new Dice(1,12),
            12,
            new Proficiency("Armor", new String[] {"Light Armor", "Medium Armor", "Shields"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Martial Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Strength", "Constitution"}),
            new Proficiency("Skills", new String[] {"Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"})
        );
    }
}
