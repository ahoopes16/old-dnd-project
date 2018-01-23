package model.characters;

import java.util.Arrays;

public class CharacterAbilities {

    private final String[] ABILITY_NAMES = {
            "Strength",
            "Dexterity",
            "Constitution",
            "Intelligence",
            "Wisdom",
            "Charisma"
    };
    private Ability[] abilitiesList;

    public CharacterAbilities() {
        abilitiesList = new Ability[ABILITY_NAMES.length];

        for (int i = 0; i < ABILITY_NAMES.length; i++)
            abilitiesList[i] = new Ability(ABILITY_NAMES[i], 0);
    }

    public Ability[] getAbilitiesList() { return abilitiesList; }

    public void increaseAbility(Ability ab) {
        for (int i = 0; i < abilitiesList.length; i++) {
            if (abilitiesList[i].getName() == ab.getName())
                abilitiesList[i].add(ab);
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for(Ability ability: abilitiesList)
            text.append("\n  " + ability.toString());

        return text.toString();
    }
}