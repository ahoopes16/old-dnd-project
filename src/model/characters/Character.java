package model.characters;
/*
 * Class to house all of the information about a player. 
 * Currently also runs the data input screen but that will change**
 */
import model.characters.enums.CharacterAlignment;
import model.characters.enums.CharacterSize;

import java.io.Serializable;

public class Character implements Serializable
{

	private static final long serialVersionUID = -2838181524333516774L;
	private String playerName;
	private String characterName;
	private int characterLevel; //currentExperience
	private String characterRace;
	private String characterClass;
	private CharacterAlignment alignment;
	private Demographics demographics;
	private String characterDeity;
	private CharacterMods mods;

    private static final String[] CLASS_OPTIONS = {"class","Barbarian", "Bard", "Druid", "Monk", "Paladin", "Ranger", "Sorcerer", "Warlock"};
	private static final String[] RACE_OPTIONS = {"race","Dragonborn", "Dwarf", "Eladrin", "Elf", "Gnome", "Half-elf", "Half-orc", "Halfling", "Human", "Tiefling"};
	private static final String[] ALIGNMENTS = {"alignment","LawfulGood", "NeutralGood", "ChaoticGood", "LawfulNeutral", "Neutral", "ChaoticNeutral", "LawfulEvil", "NeutralEvil"};

    public Character() {
        playerName = "Player Name";
        characterName = "Character Name";
        characterRace = RACE_OPTIONS[0];
        characterClass = CLASS_OPTIONS[0];
//        characterAlignment = alignments[0];
        characterDeity = "Character Diety";
        characterLevel = 0;
        alignment = null;
        demographics = new Demographics(CharacterSize.Medium,0,0,null,null,null,null,null);
        mods = new CharacterMods();
    }

	public Character(String playerName, String characterName, int characterLevel, String characterRace, String characterClass,
					 CharacterAlignment alignment, Demographics demographics, String characterDeity, CharacterMods mods)
	{
		this.playerName = playerName;
		this.characterName = characterName;
		this.characterLevel = characterLevel;
		this.characterRace = characterRace;
		this.characterClass = characterClass;
		this.alignment = alignment;
		this.demographics = demographics;
		this.characterDeity = characterDeity;
		this.mods = mods;
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

	public String getCharacterRace() {
		return characterRace;
	}

	public void setCharacterRace(String characterRace) {
		this.characterRace = characterRace;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getCharacterDeity() {
		return characterDeity;
	}

	public void setCharacterDeity(String characterDeity) {
		this.characterDeity = characterDeity;
	}

	public int getCharacterLevel() {
		return characterLevel;
	}

	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
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

    public CharacterMods getMods() {
		return mods;
	}

	public void setMods(CharacterMods mods) {
		this.mods = mods;
	}

//    public String getCharacterAlignment() {
//        return characterAlignment;
//    }
//
//    public void setCharacterAlignment(String characterAlignment) {
//        this.characterAlignment = characterAlignment;
//    }

    public String[] getClassOptions() {
		return CLASS_OPTIONS;
	}

	public String[] getRaceOptions() {
		return RACE_OPTIONS;
	}

	public String[] getAlignments() {
		return ALIGNMENTS;
	}

	@Override
	public String toString() {
		return "Character:" + '\n' +
				"- playerName='" + playerName + '\n' +
				"- characterName='" + characterName + '\n' +
				"- characterLevel=" + characterLevel + '\n' +
				"- characterRace='" + characterRace + '\n' +
				"- characterClass='" + characterClass + '\n' +
				"- alignment=" + alignment + '\n' +
				"- characterDeity='" + characterDeity + '\n' +
				demographics + '\n' +
				mods;
	}
}
