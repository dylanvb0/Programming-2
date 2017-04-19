/*
 * Dylan Vander Berg
 * Lab Exercise 16
 * 5: Enhance Face Drawing
 */
package lab16;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.FlowLayout;

public class ActionFace extends JFrame
{
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;
    
    public static final int SMALL_WIDTH = 200; //for confirm window
    public static final int SMALL_HEIGHT = 100;//for confirm window

    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 100;

    public static final int EYE_WIDTH = 20;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = X_FACE + 55;
    public static final int Y_RIGHT_EYE = Y_FACE + 60;
    public static final int X_LEFT_EYE = X_FACE + 130;
    public static final int Y_LEFT_EYE = Y_FACE + 60;
    
    public static final int NOSE_WIDTH = 10;
    public static final int NOSE_HEIGHT = 20;
    public static final int X_NOSE = X_FACE + 92;
    public static final int Y_NOSE = Y_FACE + 80;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 100;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = 180;
    private static final int Y_MOUTH_FROWN = Y_MOUTH + MOUTH_HEIGHT / 2;
	private static final int MOUTH_FROWN_START_ANGLE = 0;
	private static final int MOUTH_FROWN_ARC_SWEEP = 180;
    
    public static final int Y_MUST_M = Y_MOUTH - MOUTH_HEIGHT + 60;
    public static final int MUST_ARC_WIDTH = 50;
    public static final int MUST_ARC_HEIGHT = 50;
    public static final int MUST_LEFT_ARC_START = 135;
    public static final int MUST_LEFT_ARC_SWEEP = 135;
    public static final int MUST_RIGHT_ARC_START = 270;
    public static final int MUST_RIGHT_ARC_SWEEP = 135;
	

    private boolean wink;
    private boolean smile;

    private class WinkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            wink = true; 
            repaint( );
        }
    } // End of WinkAction inner class


    public static void main(String[] args)
    {
        ActionFace drawing = new ActionFace( );
        drawing.setVisible(true);
    }

    public ActionFace( )
    {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new CheckOnExit());
        setTitle("Hello There!"); 
        setLayout(new BorderLayout( ));
        getContentPane( ).setBackground(Color.white);
        JPanel bottomLayout = new JPanel(new FlowLayout());

        JButton winkButton = new JButton("Click for a Wink.");
        winkButton.addActionListener(new WinkAction( ));
        bottomLayout.add(winkButton);
        JButton smileButton = new JButton("Smile");
        smileButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				smile = true;
				repaint();
			}
        });
        bottomLayout.add(smileButton);
        JButton frownButton = new JButton("Frown");
        frownButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				smile = false;
				repaint();
			}
        });
        bottomLayout.add(frownButton);
        add(bottomLayout, BorderLayout.SOUTH);
        smile = true;
        wink = false;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //Draw Right Eye:
        g.setColor(Color.BLUE);
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        //Draw Left Eye:
        if (wink){
        	g.setColor(Color.BLACK);
            g.drawLine(X_LEFT_EYE, Y_LEFT_EYE, 
                                   X_LEFT_EYE + EYE_WIDTH, Y_LEFT_EYE);
        }
        else
            g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        //Draw Nose:
        g.setColor(Color.BLACK);
        g.fillOval(X_NOSE, Y_NOSE, NOSE_WIDTH, NOSE_HEIGHT);
        //Draw Mouth:
        g.setColor(Color.RED);
        if(smile){
        	g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                  MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
        }else{
        	g.drawArc(X_MOUTH, Y_MOUTH_FROWN, MOUTH_WIDTH, MOUTH_HEIGHT,
                    MOUTH_FROWN_START_ANGLE, MOUTH_FROWN_ARC_SWEEP);
        }
        //Draw Mustache
        g.setColor(new Color(139,69,19));
        g.drawLine(X_MOUTH, Y_MUST_M, X_MOUTH + MOUTH_WIDTH, Y_MUST_M);
        g.drawArc(X_MOUTH - MUST_ARC_WIDTH / 2, Y_MUST_M - MUST_ARC_HEIGHT, MUST_ARC_WIDTH, MUST_ARC_HEIGHT,
                MUST_LEFT_ARC_START, MUST_LEFT_ARC_SWEEP);
        g.drawArc(X_MOUTH + MOUTH_WIDTH - MUST_ARC_WIDTH / 2, Y_MUST_M - MUST_ARC_HEIGHT, MUST_ARC_WIDTH, MUST_ARC_HEIGHT,
                MUST_RIGHT_ARC_START, MUST_RIGHT_ARC_SWEEP);
    }

    private class CheckOnExit implements WindowListener
    {
        public void windowOpened(WindowEvent e)
        {}

        public void windowClosing(WindowEvent e)
        {
            ConfirmWindow checkers = new ConfirmWindow( );
            checkers.setVisible(true);
        }

        public void windowClosed(WindowEvent e)
        {}

        public void windowIconified(WindowEvent e)
        {}

         public void windowDeiconified(WindowEvent e)
        {}

        public void windowActivated(WindowEvent e)
        {}

        public void windowDeactivated(WindowEvent e)
        {}
    } //End of inner class CheckOnExit
    
    private class ConfirmWindow extends JFrame implements ActionListener
    {
        public ConfirmWindow( )
        {
            setSize(SMALL_WIDTH, SMALL_HEIGHT);
            getContentPane( ).setBackground(Color.YELLOW);
            setLayout(new BorderLayout( ));

            JLabel confirmLabel = new JLabel(
                           "Are you sure you want to exit?");
            add(confirmLabel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel( );
            buttonPanel.setBackground(Color.ORANGE);
            buttonPanel.setLayout(new FlowLayout( ));

            JButton exitButton = new JButton("Yes");
            exitButton.addActionListener(this);
            buttonPanel.add(exitButton);

            JButton cancelButton = new JButton("No");
            cancelButton.addActionListener(this);
            buttonPanel.add(cancelButton);

            add(buttonPanel, BorderLayout.SOUTH);
        }

        public void actionPerformed(ActionEvent e) 
        {
            String actionCommand = e.getActionCommand( );

            if (actionCommand.equals("Yes")) 
                System.exit(0);
            else if (actionCommand.equals("No"))
                dispose( );//Destroys only the ConfirmWindow.
            else
                System.out.println("Unexpected Error in Confirm Window.");
        }
    } //End of inner class ConfirmWindow
}
