import javax.swing.*;

public class MainFrame extends JFrame 
{
	private static final long serialVersionUID = 2269971701250845501L;

	public MainFrame()
	{
		super( "Dungeons and Dragons Character Creator" );
		
		//set look and feel to Nimbus
		try 
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (Exception e) 
		{
			System.out.println("Had an issue setting the look and feel.");
			e.printStackTrace();
		}
		setSize( 600,500 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
	}
}
