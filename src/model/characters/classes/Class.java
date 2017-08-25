package model.characters.classes;
import model.Dice;

import java.util.Arrays;

public abstract class Class {
    private String name;
    private Dice hitDice;
    private int baseHitPoints;
    private Proficiency armor;
    private Proficiency weapons;
    private Proficiency tools;
    private Proficiency savingThrows;
    private Proficiency skills;
    private int skillsCount;
    private String[] startingFeats;

    public Class(String name, Dice hitDice, int baseHitPoints, Proficiency armor, Proficiency weapons, Proficiency tools,
                 Proficiency savingThrows, Proficiency skills, int skillsCount, String[] startingFeats) {
        this.name = name;
        this.hitDice = hitDice;
        this.baseHitPoints = baseHitPoints;
        this.armor = armor;
        this.weapons = weapons;
        this.tools = tools;
        this.savingThrows = savingThrows;
        this.skills = skills;
        this.skillsCount = skillsCount;
        this.startingFeats = startingFeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dice getHitDice() {
        return hitDice;
    }

    public void setHitDice(Dice hitDice) {
        this.hitDice = hitDice;
    }

    public int getBaseHitPoints() {
        return baseHitPoints;
    }

    public void setBaseHitPoints(int baseHitPoints) {
        this.baseHitPoints = baseHitPoints;
    }

    public Proficiency getArmor() {
        return armor;
    }

    public void setArmor(Proficiency armor) {
        this.armor = armor;
    }

    public Proficiency getWeapons() {
        return weapons;
    }

    public void setWeapons(Proficiency weapons) {
        this.weapons = weapons;
    }

    public Proficiency getTools() {
        return tools;
    }

    public void setTools(Proficiency tools) {
        this.tools = tools;
    }

    public Proficiency getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(Proficiency savingThrows) {
        this.savingThrows = savingThrows;
    }

    public Proficiency getSkills() {
        return skills;
    }

    public void setSkills(Proficiency skills) {
        this.skills = skills;
    }

    public int getSkillsCount() { return skillsCount; }

    public void setSkillsCount(int skillsCount) { this.skillsCount = skillsCount; }

    public String[] getStartingFeats() { return startingFeats; }

    public void setStartingFeats(String[] startingFeats) { this.startingFeats = startingFeats; }

    @Override
    public String toString() {
        return "Class: " + name +
                "\n Hit Dice: " + hitDice +
                "\n Base HP: " + baseHitPoints +
                "\n Armor Proficiencies: " + armor +
                "\n Weapons Proficiencies: " + weapons +
                "\n Tool Proficiencies: " + tools +
                "\n Saving Throws: " + savingThrows +
                "\n Trainable Skills: " + skills +
                "\n Skills Count: " + skillsCount +
                "\n Starting Feats: " + Arrays.toString(startingFeats);
    }
}
