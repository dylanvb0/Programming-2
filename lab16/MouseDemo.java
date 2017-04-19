/*
 * Dylan Vander Berg
 * Lab Exercise 16
 * 7: Mouse Listener
 */
package lab16;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;

public class MouseDemo extends JFrame implements MouseListener{
	HashMap<Integer, Integer> points;

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());//add point to map
		points.put(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//paint a circle for every entry in the Map
		for(Entry<Integer, Integer> entry : points.entrySet()){
			g.fillOval(entry.getKey(), entry.getValue(), 3, 3);
		}
		
	}
	
	public MouseDemo(){
		//init frame
		super();
		points = new HashMap<Integer, Integer>();
		setSize(600, 400);
		setTitle("Mouse Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);//add mouse listener
	}
	
	public static void main(String[] args){
		MouseDemo m = new MouseDemo();
		m.setVisible(true);
	}

}
