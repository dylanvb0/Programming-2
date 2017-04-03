/*
 * Dylan Vander Berg
 * Lab Exercise 15
 * 2: Tic Tac Toe
 */
package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
	private static boolean x;
	private static JLabel label;
	private static JFrame frame;

	public static void main(String[] args) {
		label = new JLabel("Tic-Tac-To");
		setupGame();
	}
	
	private static void setupGame(){
		if(frame != null){
			frame.dispose();//close previous window before creating new instance
		}
		frame = new JFrame();
		frame.setSize(350, 600);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = true;
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel boardPanel = setBoardLayout();//layout for board
		JPanel labelPanel = new JPanel(new FlowLayout());//layout for label
		labelPanel.add(label);
		//add panels to main panel
		mainPanel.add(labelPanel, BorderLayout.NORTH);
		mainPanel.add(boardPanel, BorderLayout.CENTER);
		frame.getContentPane().add(mainPanel);
		frame.setVisible(true);
	}

	private static JPanel setBoardLayout() {
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

	protected static void checkGameOver(JButton [] btns) {
		//top row
		if(btns[0].getText().equals(btns[1].getText()) && btns[1].getText().equals(btns[2].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			setupGame();
			return;
		}
		//middle row
		if(btns[3].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[5].getText()) && !btns[3].getText().equals("")){
			label.setText(btns[3].getText() + "'s win");
			setupGame();
			return;
		}
		//bottom row
		if(btns[6].getText().equals(btns[7].getText()) && btns[7].getText().equals(btns[8].getText()) && !btns[6].getText().equals("")){
			label.setText(btns[6].getText() + "'s win");
			setupGame();
			return;
		}
		//left col
		if(btns[0].getText().equals(btns[3].getText()) && btns[3].getText().equals(btns[6].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			setupGame();
			return;
		}
		//middle col
		if(btns[1].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[7].getText()) && !btns[1].getText().equals("")){
			label.setText(btns[1].getText() + "'s win");
			setupGame();
			return;
		}
		//bottom row
		if(btns[2].getText().equals(btns[5].getText()) && btns[5].getText().equals(btns[8].getText()) && !btns[2].getText().equals("")){
			label.setText(btns[2].getText() + "'s win");
			setupGame();
			return;
		}
		//top left bottom right
		if(btns[0].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[8].getText()) && !btns[0].getText().equals("")){
			label.setText(btns[0].getText() + "'s win");
			setupGame();
			return;
		}
		//top right bottom left
		if(btns[2].getText().equals(btns[4].getText()) && btns[4].getText().equals(btns[6].getText()) && !btns[2].getText().equals("")){
			label.setText(btns[2].getText() + "'s win");
			setupGame();
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
			setupGame();
		}
		label.setText("Tic-Tac-Toe");
		
	}

}
