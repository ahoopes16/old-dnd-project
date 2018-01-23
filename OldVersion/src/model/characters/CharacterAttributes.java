package model.characters;

import java.util.Arrays;

public class CharacterAttributes {
    private final String[] ATTRIBUTE_NAMES = {
            "Inspiration",
            "Proficiency Bonus",
            "Armor Class",
            "Initiative",
            "Maximum Health"
    };

    private Attribute[] attributesList;

    public CharacterAttributes() {
        attributesList = new Attribute[ATTRIBUTE_NAMES.length];

        for (int i = 0; i < ATTRIBUTE_NAMES.length; i++){
            attributesList[i] = new Attribute(ATTRIBUTE_NAMES[i], 0);
        }
    }

    public Attribute[] getAttributesList() {
        return attributesList;
    }

    public void setAttributesList(Attribute[] attributesList) {
        this.attributesList = attributesList;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for(Attribute attribute: attributesList)
            text.append("\n  " + attribute.toString());

        return text.toString();
    }
}
