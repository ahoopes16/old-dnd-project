import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainButtonsPanel extends JPanel 
{
	private final Dimension panelDim = new Dimension(200,400);
	private final Dimension btnDim = new Dimension(130,50);
	private final String[] buttonNames = {"New", "Load", "Exit"};
	private JButton[] buttonArray = new JButton[3];
	
	public MainButtonsPanel()
	{
		//set preferences for the panel
		setPreferredSize(panelDim);
		setBorder(BorderFactory.createEmptyBorder(85, 0, 100, 0));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setOpaque(false);
		
		//initialize and set up buttons
		for(int i = 0; i < 3; i++)
		{
			buttonArray[i] = new JButton(buttonNames[i]);
			buttonArray[i].setAlignmentX(CENTER_ALIGNMENT);
			buttonArray[i].setMinimumSize(btnDim);
			buttonArray[i].setMaximumSize(btnDim);
			buttonArray[i].setPreferredSize(btnDim);
			add(buttonArray[i]);
			add(Box.createVerticalStrut(30));
		}
	}
}
