package model.characters.classes;

import model.Dice;

public class RangerClass extends Class {
    public RangerClass() {
        super(
            "Ranger",
            new Dice(1,10),
            10,
            new Proficiency("Armor", new String[] {"Light Armor", "Medium Armor", "Shields"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Martial Weapons"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Strength", "Dexterity"}),
            new Proficiency("Skills", new String[] {"Animal Handling", "Athletics", "Insight", "Investigation", "Nature", "Perception", "Stealth", "Survival"}),
            3,
            new String[] {"Favored Enemy", "Natural Explorer"}
        );
    }
}
