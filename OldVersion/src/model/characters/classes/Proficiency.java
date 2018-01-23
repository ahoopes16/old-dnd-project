package model.characters.classes;

import java.util.Arrays;

public class Proficiency {
    private String name;
    private String[] proficiencies;

    public Proficiency(String name, String[] proficiencies) {
        this.name = name;
        this.proficiencies = proficiencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    @Override
    public String toString() {
        return Arrays.toString(proficiencies);
    }
}
