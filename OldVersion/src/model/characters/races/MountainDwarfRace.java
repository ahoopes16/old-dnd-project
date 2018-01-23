package model.characters.races;

import model.characters.Ability;

public class MountainDwarfRace extends Race {
    public MountainDwarfRace() {
        super(
                "Mountain Dwarf",
                25,
                new Ability[]{new Ability("Constitution", 2), new Ability("Strength", 2)},
                new String[]{"Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Dwarven Armor Training"});
    }
}
