import javax.swing.SwingUtilities;

public class DndApp {

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				MainFrame main = new MainFrame();
			}
		});

	}

}
