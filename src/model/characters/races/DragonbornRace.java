package model.characters.races;

import model.characters.Ability;

public class DragonbornRace extends Race {
    public DragonbornRace() {
        super(
                "Dragonborn",
                30,
                new Ability[]{new Ability("Strength", 2), new Ability("Charisma", 1)},
                new String[]{"Draconic Ancestry", "Breath Weapon", "Damage Resistance"});
    }
}
