package model.characters.races;

import model.characters.Ability;

public class HalfElfRace extends Race {
    public HalfElfRace() {
        super(
                "Half-Elf",
                30,
                new Ability[0], //figure out what to do with "choose your own" ability mods
                new String[] {"Darkvision", "Fey Ancestry", "Skill Versatility"});
    }
}
