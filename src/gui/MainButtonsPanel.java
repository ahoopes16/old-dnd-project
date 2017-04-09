package gui;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Panel that handles the buttons on the main menu screen
 * @author Alex Hoopes
 * @author Dustin Roan
 * @version 2 April 2017
 */

public class MainButtonsPanel extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -1485661968812124763L;
	private final Dimension PANEL_DIM = new Dimension(200,400);
	private final Dimension BTN_DIM = new Dimension(130,50);
	private final String[] BTN_NAMES = {"New", "Load", "Exit"};
	private JButton[] buttonArray = new JButton[3];
	private WindowListener listener;
	
	/**
	 * Default Constructor
	 */
	public MainButtonsPanel()
	{
		//set preferences for the panel
		setPreferredSize(PANEL_DIM);
		setBorder(BorderFactory.createEmptyBorder(85, 0, 100, 0));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setOpaque(false);
		
		//initialize and set up buttons
		for(int i = 0; i < 3; i++)
		{
			buttonArray[i] = new JButton(BTN_NAMES[i]);
			buttonArray[i].setAlignmentX(CENTER_ALIGNMENT);
			buttonArray[i].setMinimumSize(BTN_DIM);
			buttonArray[i].setMaximumSize(BTN_DIM);
			buttonArray[i].setPreferredSize(BTN_DIM);
			buttonArray[i].addActionListener(this);
			add(buttonArray[i]);
			add(Box.createVerticalStrut(30));
		}
		buttonArray[0].setActionCommand("new");
		buttonArray[1].setActionCommand("load");
	}
	
	/**
	 * This sets the action event listener for the panel
	 * @param listener a WindowListener event listener
	 */
	public void setWindowListener(WindowListener listener)
	{
		this.listener = listener;
	}
	
	/**
	 * The event handler for the panel
	 */
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() != buttonArray[2])
		{
			listener.buttonPushed(ae);
		}
		else
		{
			System.out.println("Thanks for using this!");
			System.exit(0);
		}
	}
}
