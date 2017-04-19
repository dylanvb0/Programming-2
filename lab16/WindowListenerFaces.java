/*
 * Dylan Vander Berg
 * Lab Exercise 16
 * 3: WindowListener Faces
 */
package lab16;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class WindowListenerFaces extends JFrame{
	boolean smile = true;
	
	public WindowListenerFaces(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		setSize(400, 400);
		
		addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				smile = true;
				repaint();
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				smile = false;
				repaint();
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawOval(50, 45, 300, 300);//head
		g.fillOval(150, 100, 30, 20);//left eye
        g.fillOval(250, 100, 30, 20); //right eye
        if(smile)
        	g.drawArc(100, 150, 200, 70, 180, 180);//mouth
        else
        	g.drawArc(100, 200, 200, 70, 0, 180);//mouth
	}

	public static void main(String[] args) {
		WindowListenerFaces frame = new WindowListenerFaces();
	}

}
