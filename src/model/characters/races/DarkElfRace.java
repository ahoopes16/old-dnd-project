package model.characters.races;

import model.characters.Ability;

public class DarkElfRace extends Race {
    public DarkElfRace() {
        super(
                "Dark Elf(Drow)",
                30,
                new Ability[]{new Ability("Dexterity", 2), new Ability("Charisma", 1)},
                new String[]{"Superior Darkvision", "Keen Senses", "Fey Ancestry", "Trance", "Sunlight Sensitivity", "Drow Magic", "Drow Weapon Training"});
    }
}
