import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Class for the main menu of our DnD repository.
 * @author Kevin Hoopes and Dustin Roan
 * @version Feb. 12, 2017
 *
 */

public class MainMenu extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel[] rows = new JPanel[4];
	JButton[] buttons = new JButton[3];
	JLabel image = new JLabel(new ImageIcon("dndFun.jpg"));
	String[] buttonNames = {"GM Portal", "Player Portal", "Exit"};
	Dimension buttonDim = new Dimension(50,50);
	Dimension imageDim = new Dimension(200,200);
	
	public MainMenu()
	{
		super("Name this Program you twats ;)");
		setSize(500, 700);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 1);
		setLayout(grid);
		
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		for( int i = 0; i < rows.length; i++ )
		{
			rows[i] = new JPanel();
			rows[i].setLayout(flow);
		}
		
		for( int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].addActionListener(this);
			buttons[i].setSize(buttonDim);
		}
		
		rows[0].add(image);
		add(rows[0]);
		
		for( int i = 1; i < rows.length; i++ )
		{
			rows[i].add(buttons[i-1]);
			add(rows[i]);
		}
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == buttons[0])
		{
			//will open GM Portal
		}
		
		if(ae.getSource() == buttons[1])
		{
			//will open Player Portal
		}
		
		if(ae.getSource() == buttons[2])
		{
			System.out.println("Thanks for using our DnD Repository!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		MainMenu menu = new MainMenu();
	}
}