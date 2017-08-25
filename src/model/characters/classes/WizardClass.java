package model.characters.classes;

import model.Dice;

public class WizardClass extends Class {

    public WizardClass() {
        super(
            "Wizard",
            new Dice(1,6),
            6,
            new Proficiency("Armor", new String[] {"None"}),
            new Proficiency("Weapons", new String[]{"Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbow"}),
            new Proficiency("Tools", new String[] {"None"}),
            new Proficiency("Saving Throws", new String[] {"Intelligence", "Wisdom"}),
            new Proficiency("Skills", new String[] {"Arcana", "History", "Insight", "Investigation", "Medicine", "Religion"})
        );
    }
}
