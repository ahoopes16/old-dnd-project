package model.characters.races;

import model.characters.Ability;

public class HillDwarfRace extends Race {
    public HillDwarfRace() {
        super(
                "Hill Dwarf"
                , 25
                , new Ability[]{new Ability("Constitution", 2), new Ability("Wisdom", 1)}
                , new String[]{"Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Dwarven Toughness"});
    }
}
