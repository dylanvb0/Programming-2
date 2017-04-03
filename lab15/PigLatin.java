/*
 * Dylan Vander Berg
 * Lab Exercise 15
 * 1: Pig Latin
 */
package lab15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PigLatin {

	public static void main(String[] args) {
		//setup jframe
		JFrame frame = new JFrame();
		frame.setSize(350, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add necessary components
		JTextArea text = new JTextArea(11, 20);
		text.setPreferredSize(new Dimension(300, 200));
		text.setVisible(true);
		JLabel engLabel = new JLabel("English text");
		JLabel pigLabel = new JLabel("Pig Latin translation");
		JTextArea newText = new JTextArea(11, 20);
		newText.setPreferredSize(new Dimension(300, 200));		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//convert text
				String str = text.getText();
				String newStr = "";
				while(str.length() > 0){
					String currentWord = str.substring(0, (str.indexOf(" ") != -1) ? str.indexOf(" ") : str.length());//get current word
					if(currentWord.startsWith("a") || currentWord.startsWith("e") || currentWord.startsWith("i") || currentWord.startsWith("o") || currentWord.startsWith("u")){
						currentWord += "way";//add way if starts with vowel
					}else{
						currentWord = currentWord.substring(1) + currentWord.substring(0, 1) + "bay";//if consonant, put first letter at end and add bay
					}
					newStr += " " + currentWord;//add modified word to current string
					if(str.indexOf(" ") != -1){
						str = str.substring(str.indexOf(" ")).trim();//remove word from string if there is one
					}else{
						break;
					}
				}
				newText.setText(newStr);//set text to the modified string
			}
		});
		
		setLayout(frame, engLabel, text, button, pigLabel, newText);
		
		frame.setVisible(true);
	}
	
	private static void setLayout(JFrame frame, JComponent... args){
		Container pane = frame.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));//create FlowLayout
        pane.setSize(350, 425);
        //add components to layout
        for(JComponent comp : args){
        	pane.add(comp);
        }
	}

}
