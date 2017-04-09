package gui;
import javax.swing.SwingUtilities;

/**
 * Main launcher for the GUI part of the program
 * @author Alex Hoopes
 * @author Dustin Roan
 * @version 2 April 2017
 */
public class DndApp {

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new MainFrame();
			}
		});

	}

}
