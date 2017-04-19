/*
 * Dylan Vander Berg
 * Lab Exercise 17
 * 2: Clock Learning
 */
package lab17;

import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JApplet{
	public DisplayClock(){
		StillClock clock = new StillClock();
		
		add(clock);
	}
	
	public void init(){
		setSize(300, 350);
		setVisible(true);
	}
}
