package model.characters.races;

import model.characters.Ability;

public class WoodElfRace extends Race{
    public WoodElfRace() {
        super(
                "Wood Elf",
                30,
                new Ability[]{new Ability("Dexterity", 2), new Ability("Wisdom", 1)},
                new String[]{"Darkvision", "Keen Senses", "Fey Ancestry", "Trance", "Elf Weapon Training", "Fleet of Foot", "Mask of the Wild"});
    }
}
