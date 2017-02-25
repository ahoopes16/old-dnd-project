import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


/**
 * Class for the main menu of our DnD repository.
 * @author Kevin Hoopes and Dustin Roan
 * @version Feb. 12, 2017
 */
public class MainMenu extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;

	private JPanel[] rows = new JPanel[3];
	private JButton[] buttons = new JButton[3];
	private final String[] buttonNames = {"GM Portal", "Player Portal", "Exit"};
	private final Dimension buttonDim = new Dimension(200,50);
	
	/**
	 * Constructor for the main menu of the DnD Repository
	 */
	public MainMenu()
	{
		super("DnD Repository");
		
		//set the background of the menu
		try {
		    final Image backgroundImage = javax.imageio.ImageIO.read(new File("./resources/dndFun.jpg"));
		    setContentPane(new JPanel(new BorderLayout()) {
				private static final long serialVersionUID = 3219358418679061612L;

				@Override public void paintComponent(Graphics g) {
		            g.drawImage(backgroundImage, 0, 0, null);
		        }
		    });
		} catch (IOException e) {
		    e.printStackTrace();;
		}
		
		setSize(634, 384);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BoxLayout grid = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(grid);
		
		//initialize buttons, panels, and add them to frame
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		for( int i = 0; i < rows.length; i++ )
		{
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].addActionListener(this);
			buttons[i].setFont(new Font("Times New Roman", Font.BOLD, 16));
			buttons[i].setPreferredSize(buttonDim);
			rows[i] = new JPanel();
			rows[i].setOpaque(false);
			rows[i].setLayout(flow);
			rows[i].add(buttons[i]);
			add(rows[i]);
		}
		
		setVisible(true);
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
		}
		
		//Exit the program
		if(ae.getSource() == buttons[2])
		{
			System.out.println("Thanks for using our DnD Repository!");
			System.exit(0);
		}
	}
	
	//main method for test running in early stages
	public static void main(String[] args)
	{
		MainMenu menu = new MainMenu();
	}
}
