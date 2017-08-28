package model.characters.classes;

import model.Dice;

public class BardClass extends Class {

    public BardClass() {
        super(
            "Bard",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"Light Armor"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Hand Crossbows", "Longswords","Rapiers", "Shortswords"}),
            new Proficiency("Tools", new String[] {"Three musical instruments of choice"}),
            new Proficiency("Saving Throws", new String[] {"Dexterity", "Charisma"}),
            new Proficiency("Skills", new String[] {
                    "Acrobatics",
                    "Animal Handling",
                    "Arcana",
                    "Athletics",
                    "Deception",
                    "History",
                    "Insight",
                    "Intimidation",
                    "Investigation",
                    "Medicine",
                    "Nature",
                    "Perception",
                    "Performance",
                    "Persuasion",
                    "Performance",
                    "Religion",
                    "Slight of Hand",
                    "Stealth",
                    "Survival"}),
            3,
            new String[] {"Spellcasting", "Bardic Inspiration (d6)"}
        );
    }
}
