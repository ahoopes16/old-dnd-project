import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import playerPortal.PlayerMain;

/**
 * Class for the main menu of our DnD repository.
 * @author Kevin Hoopes and Dustin Roan
 * @version Feb. 12, 2017
 */
public class MainMenu extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private JPanel[] rows;
	private JButton[] buttons;
	private final int FRAME_WIDTH = 634;
	private final int FRAME_HEIGHT = 384;
	private final String[] BUTTON_NAMES = {"GM Portal", "Player Portal", "Exit"};
	private final Dimension BUTTON_DIM = new Dimension(200,50);
	private final FlowLayout FLOW = new FlowLayout( FlowLayout.CENTER );
	
	/**
	 * Constructor for the main menu of the DnD Repository
	 */
	public MainMenu()
	{
		//set the title for the frame
		super("DnD Repository");
		
		//initialize panels and buttons
		rows = new JPanel[3];
		buttons = new JButton[3];
		
		//set the background of the menu
		try 
		{
		    final Image backgroundImage = ImageIO.read( new File( "./resources/dndFun.jpg" ) );
		    setContentPane(new JPanel( new BorderLayout() ) 
		    {
				private static final long serialVersionUID = 3219358418679061612L;

				@Override public void paintComponent(Graphics g) 
				{
		            g.drawImage( backgroundImage, 0, 0, null );
		        }
		    });
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();;
		}
		
		BoxLayout grid = new BoxLayout( getContentPane(), BoxLayout.Y_AXIS );
		
		setSize( FRAME_WIDTH, FRAME_HEIGHT );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( grid );
		
		//initialize buttons, panels, and add them to frame
		for( int i = 0; i < rows.length; i++ )
		{
			buttons[i] = new JButton( BUTTON_NAMES[i] );
			buttons[i].addActionListener( this );
			buttons[i].setFont( new Font( "Times New Roman", Font.BOLD, 16 ) );
			buttons[i].setPreferredSize( BUTTON_DIM );
			rows[i] = new JPanel();
			rows[i].setOpaque( false );
			rows[i].setLayout( FLOW );
			rows[i].add( buttons[i] );
			add( rows[i] );
		}
		
		setVisible( true );
	}
	
	/**
	 * Implements the actions for each button
	 * @param ae, the Action Event that triggers buttons
	 */
	public void actionPerformed(ActionEvent ae)
	{
		//Open the GM portal
		if(ae.getSource() == buttons[0])
		{
		}
		
		//Open the player portal
		if(ae.getSource() == buttons[1])
		{
			PlayerMain playerFrame = new PlayerMain();
			playerFrame.setVisible( true );
		}
		
		//Exit the program
		if(ae.getSource() == buttons[2])
		{
			System.out.println( "Thanks for using our DnD Repository!" );
			System.exit( 0 );
		}
	}
	
	//main method for test running in early stages
	public static void main(String[] args)
	{
		MainMenu menu = new MainMenu();
	}
}