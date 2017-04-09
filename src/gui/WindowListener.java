package gui;
import java.awt.event.ActionEvent;

/**
 * An custom event listener interface used for button presses and new frame windows
 * @author Alex Hoopes
 * @version 2 April 2017
 */

public interface WindowListener {
	public void buttonPushed(ActionEvent windowToOpen);
}
