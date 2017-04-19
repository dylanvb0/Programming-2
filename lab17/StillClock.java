/*
 * Dylan Vander Berg
 * Lab Exercise 17
 * 2: Still Clock Class
 */
package lab17;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.util.*;

public class StillClock extends JPanel {
	private int hour;
	private int minute;
	private int second;
	
	public StillClock(){
		setCurrentTime();
		addMouseListener(new MouseAdapter(){
			@Override
            public void mousePressed(MouseEvent e) {
				setCurrentTime();
                repaint();
            }
		});
	}
	
	public StillClock(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public void setHour(int hour){
		this.hour = hour;
		repaint();
	}
	
	public int getMinute(){
		return minute;
	}
	
	public void setMinute(int minute){
		this.minute = minute;
		repaint();		
	}
	
	public int getSecond(){
		return second;
	}
	
	public void setSecond(int second){
		this.second = second;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int clockRadius = (int)(Math.min(getWidth(),  getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		//draw circle
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12",  xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("11",  (int)(xCenter + clockRadius * Math.cos(4.0/6.0*Math.PI)) + 5, (int)(yCenter - clockRadius * Math.sin(4.0/6.0*Math.PI) + 10));
		g.drawString("10",  (int)(xCenter + clockRadius * Math.cos(5.0/6.0*Math.PI)) + 5, (int)(yCenter - clockRadius * Math.sin(5.0/6.0*Math.PI) + 10));
		g.drawString("9", xCenter - clockRadius + 3, yCenter  + 5);
		g.drawString("8",  (int)(xCenter + clockRadius * Math.cos(7.0/6.0*Math.PI)), (int)(yCenter - clockRadius * Math.sin(7.0/6.0*Math.PI)));
		g.drawString("7",  (int)(xCenter + clockRadius * Math.cos(8.0/6.0*Math.PI)), (int)(yCenter - clockRadius * Math.sin(8.0/6.0*Math.PI)));
		g.drawString("6",  xCenter - 5, yCenter + clockRadius - 8);
		g.drawString("5",  (int)(xCenter + clockRadius * Math.cos(10.0/6.0*Math.PI)), (int)(yCenter - clockRadius * Math.sin(10.0/6.0*Math.PI)) - 5);
		g.drawString("4",  (int)(xCenter + clockRadius * Math.cos(11.0/6.0*Math.PI) - 8), (int)(yCenter - clockRadius * Math.sin(11.0/6.0*Math.PI) + 3));
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("2",  (int)(xCenter + clockRadius * Math.cos(1.0/6.0*Math.PI) - 12), (int)(yCenter - clockRadius * Math.sin(1.0/6.0*Math.PI)) + 8);
		g.drawString("1",  (int)(xCenter + clockRadius * Math.cos(2.0/6.0*Math.PI) - 15), (int)(yCenter - clockRadius * Math.sin(2.0/6.0*Math.PI) + 12));
		
		//draw second hand - OMIT
//		int sLength = (int)(clockRadius * 0.8);
//		int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI/60)));
//		int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
//		g.setColor(Color.RED);
//		g.drawLine(xCenter, yCenter, xSecond, ySecond);
		
		//draw minute hand
		int mLength = (int)(clockRadius * 0.65);
		int xMinute = (int)(xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int)(yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
		g.setColor(Color.BLUE);
		g.drawLine(xCenter, yCenter, xMinute, yMinute);
		
		//draw hour hand
		int hLength = (int)(clockRadius * 0.65);
		int xHour = (int)(xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		int yHour = (int)(yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		g.setColor(Color.GREEN);
		g.drawLine(xCenter, yCenter, xHour, yHour);
		
	}
	
	public void setCurrentTime(){
		
		
		this.hour = (int) (Math.random() * 12);
		this.minute = (int) (Math.random() * 4) * 15;//cast to int before multipying by 15 to restrict to 0, 15, 30, and 45
//		this.second = (int) (Math.random() * 60);
 	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
	
}
