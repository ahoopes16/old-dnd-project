package model.characters.races;

import model.characters.Ability;

public class HighElfRace extends Race {
    public HighElfRace() {
        super(
                "High Elf",
                30,
                new Ability[]{new Ability("Dexterity", 2), new Ability("Intelligence", 1)},
                new String[]{"Darkvision", "Keen Senses", "Fey Ancestry", "Trance", "Elf Weapon Training", "Cantrip", "Extra Language"});
    }
}
