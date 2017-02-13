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
	JLabel image = new JLabel(new ImageIcon(new ImageIcon("dndFun.jpg").getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT)));
	String[] buttonNames = {"GM Portal", "Player Portal", "Exit"};
	Dimension buttonDim = new Dimension(200,50);
	Dimension panelDim = new Dimension(500, 50);
	Dimension imageDim = new Dimension(200,200);
	
	public MainMenu()
	{
		super("Name this Program you twats ;)");
<<<<<<< HEAD
		setSize(300, 500);
=======
		setSize(300, 1000);
>>>>>>> branch 'master' of https://github.com/ahoopes16/dnd-project.git
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BoxLayout grid = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(grid);
		
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		//flow.setVgap(0);
		for( int i = 0; i < rows.length; i++ )
		{
			rows[i] = new JPanel();
			rows[i].setLayout(flow);
			if ( i == 0 )
			{
				rows[i].setSize(imageDim);
			}
			else
			{
				rows[i].setSize(panelDim);
			}
		}
		
		for( int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].addActionListener(this);
			buttons[i].setFont(new Font("Times New Roman", Font.BOLD, 16));
			buttons[i].setPreferredSize(buttonDim);
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