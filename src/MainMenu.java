import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Class for the main menu of our DnD repository.
 * @author Kevin Hoopes and Dustin Roan
 * @version Feb. 12, 2017
 *
 */

public class MainMenu extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel[] rows = new JPanel[4];
	JButton[] buttons = new JButton[3];
	String[] buttonNames = {"GM Portal", "Player Portal", "Exit"};
	Dimension button = new Dimension(50,50);
	Dimension image = new Dimension(200,200);
	
	MainMenu()
	{
		super("Name this Program you twats ;)");
		setSize(500, 700);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 1);
		setLayout(grid);
		
	}
}
