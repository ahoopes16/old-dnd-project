package model.characters.races;

import model.characters.Ability;

public class RockGnomeRace extends Race {

    public RockGnomeRace() {
        super(
                "Rock Gnome",
                25,
                new Ability[] {new Ability("Intelligence", 2), new Ability("Constitution", 1)},
                new String[] {"Darkvision", "Gnome Cunning", "Artificer's Lore", "Tinker"});
    }
}
