package model.characters.races;

import model.characters.Ability;

public class ForestGnomeRace extends Race {
    public ForestGnomeRace() {
        super(
                "Forest Gnome",
                25,
                new Ability[]{new Ability("Intelligence", 2), new Ability("Dexterity", 1)},
                new String[]{"Darkvision", "Gnome Cunning", "Natural Illusionist", "Speak with Small Beasts"});
    }
}
