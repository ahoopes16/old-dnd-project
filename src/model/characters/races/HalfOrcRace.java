package model.characters.races;

import model.characters.Ability;

public class HalfOrcRace extends Race {
    public HalfOrcRace() {
        super(
                "Half-Orc",
                30,
                new Ability[] {new Ability("Strength", 2), new Ability("Constitution", 1)},
                new String[] {"Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"});
    }
}
