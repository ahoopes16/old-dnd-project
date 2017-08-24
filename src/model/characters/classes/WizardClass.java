package model.characters.classes;

import model.Dice;

public class WizardClass extends Class {
    public WizardClass() {
        setName("Wizard");
        setHitDice(new Dice(1,6));
        setBaseHitPoints(6);
        setArmor(new Proficiency("Armor", new String[] {"None"}));
        //needs finishing...
    }
}
