import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainButtonsPanel extends JPanel 
{
	private final Dimension panelDim = new Dimension(200,400);
	private JButton newBtn;
	private JButton loadBtn;
	private JButton exitBtn;
	
	
	public MainButtonsPanel()
	{
		setPreferredSize(panelDim);
		setBorder(BorderFactory.createEmptyBorder(135, 0, 100, 0));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		newBtn = new JButton("New");
		loadBtn = new JButton("Load");
		exitBtn = new JButton("Exit");
		newBtn.setAlignmentX(CENTER_ALIGNMENT);
		loadBtn.setAlignmentX(CENTER_ALIGNMENT);
		exitBtn.setAlignmentX(CENTER_ALIGNMENT);
		System.out.println(getPreferredSize());
		add(newBtn);
		add(loadBtn);
		add(exitBtn);
		setOpaque(false);
		
	}
}
