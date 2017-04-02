import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class NewCharFrame extends JFrame
{
	private static final long serialVersionUID = -4694649568870806659L;

	public NewCharFrame()
	{
		super("New Character!");
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
