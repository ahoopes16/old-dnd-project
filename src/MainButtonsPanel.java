import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainButtonsPanel extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -1485661968812124763L;
	private final Dimension PANEL_DIM = new Dimension(200,400);
	private final Dimension BTN_DIM = new Dimension(130,50);
	private final String[] BTN_NAMES = {"New", "Load", "Exit"};
	private JButton[] buttonArray = new JButton[3];
	private WindowListener listener;
	
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
	}
	
	public void setWindowListener(WindowListener listener)
	{
		this.listener = listener;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == buttonArray[0])
		{
			listener.buttonPushed("new");
		}
		else if (ae.getSource() == buttonArray[1])
		{
			listener.buttonPushed("load");
		}
		else if (ae.getSource() == buttonArray[2])
		{
			System.out.println("Thanks for using this!");
			System.exit(0);
		}
	}
}
