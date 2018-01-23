package model.characters.races;

import model.characters.Ability;

public class TieflingRace extends Race {
    public TieflingRace() {
        super(
                "Tiefling",
                30,
                new Ability[] {new Ability("Intelligence", 1), new Ability("Charisma", 2)},
                new String[] {"Darkvision", "Hellish Resistance", "Infernal Legacy"});
    }
}
