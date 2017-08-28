package model.characters;
/*
 * Class to house all of the information about a player. 
 * Currently also runs the data input screen but that will change**
 */
import model.characters.classes.Class;
import model.characters.classes.FighterClass;
import model.characters.enums.CharacterAlignment;
import model.characters.enums.CharacterSize;
import model.characters.races.HumanRace;
import model.characters.races.Race;

import java.io.Serializable;

public class Character implements Serializable
{

	private static final long serialVersionUID = -2838181524333516774L;
	private String playerName;
	private String characterName;
	private int characterLevel;
	private Race characterRace;
	private Class characterClass;
	private CharacterAlignment alignment;
	private Demographics demographics;
	private String characterDeity;
	private CharacterAttributes attributes;
	private CharacterAbilities abilities;
	private CharacterSkills skills;
	private CharacterMotivations motivations;

    private static final String[] CLASS_OPTIONS = {"class","Barbarian", "Bard", "Druid", "Fighter", "Monk", "Paladin",
            "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
	private static final String[] RACE_OPTIONS = {"race", "Dark Elf", "Dragonborn", "Forest Gnome", "Half-Elf", "Half-Orc",
			"High Elf", "Hill Dwarf", "Human", "Lightfoot Halfling", "Mountain Dwarf", "Rock Gnome", "Stout Halfling",
            "Tiefling", "Wood Elf"};
	private static final String[] ALIGNMENTS = {"alignment","Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral",
            "Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil"};

    public Character(String playerName, String characterName, int characterLevel, Race characterRace, Class characterClass, CharacterAlignment alignment, Demographics demographics,
                     String characterDeity, CharacterAttributes attributes, CharacterAbilities abilities, CharacterSkills skills, CharacterMotivations motivations) {
        this.playerName = playerName;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterRace = characterRace;
        this.characterClass = characterClass;
        this.alignment = alignment;
        this.demographics = demographics;
        this.characterDeity = characterDeity;
        this.attributes = attributes;
        this.abilities = abilities;
        this.skills = skills;
        this.motivations = motivations;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public Race getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(Race characterRace) {
        this.characterRace = characterRace;
    }

    public Class getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(Class characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterAlignment getAlignment() {
        return alignment;
    }

    public void setAlignment(CharacterAlignment alignment) {
        this.alignment = alignment;
    }

    public Demographics getDemographics() {
        return demographics;
    }

    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public String getCharacterDeity() {
        return characterDeity;
    }

    public void setCharacterDeity(String characterDeity) {
        this.characterDeity = characterDeity;
    }

    public CharacterAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CharacterAttributes attributes) {
        this.attributes = attributes;
    }

    public CharacterAbilities getAbilities() {
        return abilities;
    }

    public void setAbilities(CharacterAbilities abilities) {
        this.abilities = abilities;
    }

    public CharacterSkills getSkills() {
        return skills;
    }

    public void setSkills(CharacterSkills skills) {
        this.skills = skills;
    }

    public CharacterMotivations getMotivations() {
        return motivations;
    }

    public void setMotivations(CharacterMotivations motivations) {
        this.motivations = motivations;
    }

    @Override
    public String toString() {
        return playerName +
                "\n Character Name: " + characterName +
                "\n Character Level: " + characterLevel + "\n" +
                "\n Character Race: " + characterRace + "\n" +
                "\n Character Class: " + characterClass + "\n" +
                "\n Alignment: " + alignment + "\n" +
                "\n Demographics: " + demographics + "\n" +
                "\n Character Deity: " + characterDeity + "\n" +
                "\n Attributes: " + attributes + "\n" +
                "\n Abilities: " + abilities + "\n" +
                "\n Skills: " + skills + "\n" +
                "\n Motivations: " + motivations + "\n";
    }

    public static void main(String[] args) {
        Character kevin = new Character(
                "Alex Hoopes",
                "Cockus Maximus",
                1,
                new HumanRace(),
                new FighterClass(),
                CharacterAlignment.Chaotic_Good,
                new Demographics(CharacterSize.Medium, 21, 150, "5'9\"", "Male", "Blue", "Dark", "smooth"),
                "None",
                new CharacterAttributes(),
                new CharacterAbilities(),
                new CharacterSkills(),
                new CharacterMotivations()
        );
        System.out.println(kevin);
    }
}
