package model.characters.races;

import model.characters.Ability;

public class LightfootHalflingRace extends Race {
    public LightfootHalflingRace() {
        super(
                "Lightfoot Halfling",
                25,
                new Ability[]{new Ability("Dexterity", 2), new Ability("Charisma", 1)},
                new String[]{"Lucky", "Brave", "Halfling Nimbleness", "Naturally Stealthy"});
    }
}
