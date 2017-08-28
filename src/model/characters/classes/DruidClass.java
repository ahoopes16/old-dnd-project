package model.characters.classes;

import model.Dice;

public class DruidClass extends Class {
    public DruidClass() {
        super(
            "Druid",
            new Dice(1,8),
            8,
            new Proficiency("Armor", new String[] {"Light Armor", "Medium Armor", "Shields","(Druids will not wear armor or use shields made of metal)"}),
            new Proficiency("Weapons", new String[]{"Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"}),
            new Proficiency("Tools", new String[] {"Herbalism Kit"}),
            new Proficiency("Saving Throws", new String[] {"Intelligence", "Wisdom"}),
            new Proficiency("Skills", new String[] {"Arcana", "Animal Handling", "Insight", "Medicine", "Nature", "Perception", "Religion", "Survival"}),
            2,
            new String[] {"Spellcasting", "Druidic"}
        );
    }
}
