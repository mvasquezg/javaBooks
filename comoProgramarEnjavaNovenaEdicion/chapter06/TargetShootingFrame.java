/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 10:Drawing a Target Shooting Frame
*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class TargetShootingFrame extends JFrame{
    Toolkit screen=Toolkit.getDefaultToolkit();

    Dimension sizeScreen=screen.getScreenSize();

    int width=sizeScreen.width;
	int height=sizeScreen.height;
        
    TargetShootingPanel targetShootingPanel=new TargetShootingPanel(width/2, height/2);

    public TargetShootingFrame(){
        setTitle("Tiro al blanco");
        setSize(width/2, height/2);
        setLocation(width/4, height/4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(targetShootingPanel);
    }
}//end TargetShootingFrame