package gui;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class LoadCharFrame extends JFrame 
{
	private static final long serialVersionUID = -6067800607085997802L;

	public LoadCharFrame()
	{
		super("Load an old one!");
		setSize(500,500);
		centerWindow();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void centerWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dim.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dim.getHeight() - this.getHeight()) / 2);
		this.setLocation(x,y);
	}
}
