import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MainFrame extends JFrame 
{
	private static final long serialVersionUID = 2269971701250845501L;
	private final File BG_IMAGE = new File(".//resources//dndMainImage.jpg");
	private JLabel background;
	private MainButtonsPanel menuBtns;
	
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
		
		//set the background image
		try
		{
		background = new JLabel(new ImageIcon(ImageIO.read(BG_IMAGE)));
		}
		catch(Exception e)
		{
			System.out.println("File Not Found");
		}
		
		//frame preferences
		setContentPane(background);
		setLayout(new BorderLayout());
		setSize( 400, 400 );
		setResizable(false);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
		setLocationRelativeTo(null);
		
		//adding the panel for main menu buttons
		menuBtns = new MainButtonsPanel();
		menuBtns.setWindowListener(new WindowListener() {
			public void buttonPushed(ActionEvent windowToOpen)
			{
				if(windowToOpen.getActionCommand() == "new")
				{
					new NewCharFrame();
				}
				else if(windowToOpen.getActionCommand() == "load")
				{
					new LoadCharFrame();
				}
			}
		});
		
		add(menuBtns, BorderLayout.EAST);
	}
}
