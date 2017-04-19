/*
 * Dylan Vander Berg
 * Lab Exercise 17
 * 1: Tic Tac Toe
 */
package lab17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JApplet{
	private static boolean x;
	private static JLabel label;
	

	public void init() {
		label = new JLabel("Tic-Tac-To");
		startGame();
	}
	
	private void startGame(){
		this.setSize(350, 600);
		x = true;
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel boardPanel = setBoardLayout();//layout for board
		JPanel labelPanel = new JPanel(new FlowLayout());//layout for label
		labelPanel.add(label);
		//add panels to main panel
		mainPanel.add(labelPanel, BorderLayout.NORTH);
		mainPanel.add(boardPanel, BorderLayout.CENTER);
		this.getContentPane().add(mainPanel);
		this.setVisible(true);
	}

	private JPanel setBoardLayout() {
		JPanel board = new JPanel(new GridLayout(3, 3));//create 3x3 grid
		JButton[] buttons = new JButton[9];//create array for 9 buttons
		for(int i = 0; i < 9; i++){
			JButton btn = new JButton();//create button
			btn.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					btn.setText(x?"x":"o");//set text if clicked
					btn.setEnabled(false);//disable to not allow future clicks
					x = !x;//toggle turn
					checkGameOver(buttons);//check if game is over
				}
			});
			btn.setVisible(true);
			board.add(btn);
			buttons[i] = btn;
		}
		return board;
	}

	protected void checkGameOver(JButton [] btns) {
		//top row
		if(btns[0].getText().equals(btns[1].getText()) && btns[1].getText().equals(btns[2].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			endGame();
			return;
		}
		//middle row
		if(btns[3].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[5].getText()) && !btns[3].getText().equals("")){
			label.setText(btns[3].getText() + "'s win");
			endGame();
			return;
		}
		//bottom row
		if(btns[6].getText().equals(btns[7].getText()) && btns[7].getText().equals(btns[8].getText()) && !btns[6].getText().equals("")){
			label.setText(btns[6].getText() + "'s win");
			endGame();
			return;
		}
		//left col
		if(btns[0].getText().equals(btns[3].getText()) && btns[3].getText().equals(btns[6].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			endGame();
			return;
		}
		//middle col
		if(btns[1].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[7].getText()) && !btns[1].getText().equals("")){
			label.setText(btns[1].getText() + "'s win");
			endGame();
			return;
		}
		//bottom row
		if(btns[2].getText().equals(btns[5].getText()) && btns[5].getText().equals(btns[8].getText()) && !btns[2].getText().equals("")){
			label.setText(btns[2].getText() + "'s win");
			endGame();
			return;
		}
		//top left bottom right
		if(btns[0].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[8].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			endGame();
			return;
		}
		//top right bottom left
		if(btns[2].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[6].getText()) && !btns[2].getText().equals("")){
			label.setText(btns[2].getText() + "'s win");
			endGame();
			return;
		}
		//check full board
		boolean full = true;
		for(int i = 0; i < btns.length; i++){
			if(btns[i].isEnabled()){
				full = false;
			}
		}
		if(full){
			label.setText("It's a tie!");
			endGame();
		}
		label.setText("Tic-Tac-Toe");
		
	}
	
	public void endGame(){
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		                System.exit(0);//close program after 5 seconds
		            }
		        }, 
		        5000 
		);
	}

}
