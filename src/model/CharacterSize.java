package model;
/*
 * An enum to define and hold the the statistics for character size
 * @author Dustin
 * @version 27 January 2017
 */
public enum CharacterSize 
{
	Fine(8, -16, 16),
	Diminutive(4, -12, 12),
	Tiny(2, -8, 8),
	Small(1, -4, 4),
	Medium(0, 0, 0),
	Large(-1, 4, -4),
	Huge(-2, +8, -8),
	Gargantuan(-4, 12, -12),
	Colossal(-8, 16, -16);
	
	private final int attACMod;
	private final int specAttMod;
	private final int hideMod;
	CharacterSize(int attACMod, int specAttMod, int hideMod)
	{
		this.attACMod = attACMod;
		this.specAttMod = specAttMod;
		this.hideMod = hideMod;
	}
	public int attACMod() {return attACMod;}
	public int specAttMod() {return specAttMod;}
	public int hideMod() {return hideMod;}	
}

