package model;
/*
 * Class to house all of the information about a player. 
 * Currently also runs the data input screen but that will change**
 * @author Dustin Roan
 * @version 27 January 2017
 */
import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Character implements Serializable
{

	private static final long serialVersionUID = -2838181524333516774L;

	
	private String playerName, characterName, characterRace, characterClass, characterDeity;
	private int characterLevel; //currentExperience
	private CharacterAlignment alignment;
//	private CharacterSize size;
//	private Demographics demograph;
//	private PlayerMods mods;
    JFrame frame;
    private String[] classOptions = {"Barbarian", "Bard", "Druid", "Monk", "Paladin", "Ranger", "Sorcerer", "Warlock"};
	private String[] raceOptions = {"Dragonborn", "Dwarf", "Eladrin", "Elf", "Gnome", "Half-elf", "Half-orc", "Halfling", "Human", "Tiefling"};
	private String[] alignments = {"LawfulGood", "NeutralGood", "ChaoticGood", "LawfulNeutral", "Neutral", "ChaoticNeutral", "LawfulEvil", "NeutralEvil"};
	
    
	public Character()
	{
//		String playerName, characterName, characterRace, charcterClass, characterDeity = null;
//		int characterLevel, currentExperience = -1;
//		CharacterAlignment alignment = null;
//		CharacterSize size = null;
//		PlayerMods mods = null;
		
		setPlayerName();
		setCharacterName();
		setCharacterRace();
		setCharacterClass();
		setAlignment();
		setCharacterDeity(); //cleric need this more than string
		setCharacterLevel(); //
//		addToCurrentExperience();
//		demograph = new Demographics();
	}
	public void setPlayerName()
	{
		playerName = JOptionPane.showInputDialog(frame, "Please enter player's name: ");
	}
	public void setCharacterName()
	{
		characterName = JOptionPane.showInputDialog(frame, "Please enter character's name: ");
	}
	public void setCharacterRace() //Race will be its own class/object
	{
	    characterRace = JOptionPane.showInputDialog(frame, "Pick a race:", "Races", JOptionPane.QUESTION_MESSAGE,
	            null, raceOptions, "Titan").toString();
	}
	public void setCharacterClass() //Class will be its own class/object
	{
		characterClass = JOptionPane.showInputDialog(frame, "Pick a class:", "Classes", JOptionPane.QUESTION_MESSAGE,
	            null, classOptions, classOptions[1]).toString();
	}
	public void setAlignment()
	{
		alignment = CharacterAlignment.valueOf(JOptionPane.showInputDialog(frame, "Pick an alignment:", "Alignments", JOptionPane.QUESTION_MESSAGE,
	            null, alignments, alignments[1]).toString());
		
	}
	public void setCharacterDeity()
	{
		characterDeity = JOptionPane.showInputDialog(frame, "Please enter characters Deity of worship: ");
	}
	public void setCharacterLevel()
	{
		characterLevel = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter starting level: "));
	}
//	public void addToCurrentExperience()
//	{
//		currentExperience += Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter experience to add: "));
//	}
	public void printCharacter()
	{
		
		System.out.println(playerName + " is in control of " + characterName + " a level " + characterLevel + " " + alignment + " " + characterRace + " " + characterClass + " who worships " + characterDeity + ".");
	}
	
	public static void main(String[] args)
	{
		Character Dustin = new Character();
		Dustin.printCharacter();
		System.out.println(Dustin.toString());
	}
	@Override
	public String toString() {
		return "Character [playerName=" + playerName + ", characterName=" + characterName + ", characterRace="
				+ characterRace + ", characterClass=" + characterClass + ", characterDeity=" + characterDeity
				+ ", characterLevel=" + characterLevel + ", alignment=" + alignment + ", frame=" + frame
				+ ", classOptions=" + Arrays.toString(classOptions) + ", raceOptions=" + Arrays.toString(raceOptions)
				+ ", alignments=" + Arrays.toString(alignments) + "]";
	}
}
