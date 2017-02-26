package playerPortal;
import javax.swing.*;
import java.awt.*;

public class PlayerMain extends JFrame
{
	private final FlowLayout flow = new FlowLayout( FlowLayout.CENTER );
	private JPanel testPanel = new JPanel();
	private JButton testButton = new JButton( "Test" );
	
	public PlayerMain()
	{
		super( "Player Menu" );
		setSize( 634, 384 );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( flow );
		
		testPanel.add( testButton );
		add( testPanel );
		
		setVisible( true );
	}

}
