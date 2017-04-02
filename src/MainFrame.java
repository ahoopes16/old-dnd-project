import java.awt.FlowLayout;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MainFrame extends JFrame 
{
	private static final long serialVersionUID = 2269971701250845501L;
	private final File backgroundImage = new File(".//resources//dndMainImage.jpg");
	JLabel background;
	JButton btn;
	
	
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
		try
		{
		background = new JLabel(new ImageIcon(ImageIO.read(backgroundImage)));
		}
		catch(Exception e)
		{
			System.out.println("File Not Found");
		}
		
		btn = new JButton("Bitch");
		setContentPane(background);
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(btn);
		
		setSize( 400, 400 );
		setResizable(false);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
	}
}
