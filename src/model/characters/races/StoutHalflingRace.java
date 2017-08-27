package model.characters.races;

import model.characters.Ability;

public class StoutHalflingRace extends Race {
    public StoutHalflingRace() {
        super(
                "Stout Halfling",
                25,
                new Ability[]{new Ability("Dexterity", 2), new Ability("Constitution", 1)},
                new String[]{"Lucky", "Brave", "Halfling Nimbleness", "Stout Resilience"});    }
}
