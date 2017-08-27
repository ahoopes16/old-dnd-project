package model.characters.races;

import model.characters.Ability;

public class HumanRace extends Race {
    public HumanRace() {
        super(
                "Human",
                30,
                new Ability[]{new Ability("Strength", 1), new Ability("Dexterity", 1), new Ability("Constitution", 1), new Ability("Intelligence", 1), new Ability("Wisdom", 1), new Ability("Charisma", 1)},
                new String[]{});
    }
}