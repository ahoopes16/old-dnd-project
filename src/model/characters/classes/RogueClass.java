package model.characters.classes;

import model.Dice;

public class RogueClass extends Class {
    public RogueClass() {
        super(
            "Rogue",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"Light Armor"}),
            new Proficiency("Weapons", new String[]{"Simple Weapons", "Hand Crossbows", "Longswords", "Rapiers", "Shortswords"}),
            new Proficiency("Tools", new String[] {"Theieves' Tools"}),
            new Proficiency("Saving Throws", new String[] {"Dexterity", "Intelligence"}),
            new Proficiency("Skills", new String[] {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation", "Perception", "Performance", "Persuasion", " Sleight of Hand", "Stealth"}),
            4,
            new String[] {"Expertise", "Sneak Attack", "Thieves' Cant"}
        );
    }
}
