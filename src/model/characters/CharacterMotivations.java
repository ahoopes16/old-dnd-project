package model.characters;

import java.util.Arrays;

/**
 * Should contain:
 * -Personality Traits
 * -Ideals
 * -Bonds
 * -Flaws
 */
public class CharacterMotivations {
    private final String[] MOTIVATION_NAMES = {
            "Personality Traits",
            "Ideals",
            "Bonds",
            "Flaws"
    };
    private Motivation[] motivationList;

    public CharacterMotivations() {
        motivationList = new Motivation[MOTIVATION_NAMES.length];
        for (int i = 0; i < MOTIVATION_NAMES.length; i++) {
            motivationList[i] = new Motivation(MOTIVATION_NAMES[i]);
        }
    }

    public Motivation[] getMotivationList() { return motivationList; }

    public void setMotivationList(Motivation[] motivationList) { this.motivationList = motivationList; }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for(Motivation motivation: motivationList)
            text.append("\n  " + motivation.toString());

        return text.toString();
    }
}
