/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 11:Drawing Rectangles and Circles Frame
*/
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class RectangleCircleRandomFrame extends JFrame{
    Toolkit screen=Toolkit.getDefaultToolkit();

    Dimension sizeScreen=screen.getScreenSize();

    int width=sizeScreen.width;
	int height=sizeScreen.height;
        
    RectangleCircleRandomPanel rectangleCircleRandomPanel=new RectangleCircleRandomPanel(width/2, height/2);

    public RectangleCircleRandomFrame(){
        setTitle("Rectangulos y Circulos aleatorios");
        setSize(width/2, height/2);
        setLocation(width/4, height/4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(rectangleCircleRandomPanel);
    }
}//end RectangleCircleRandomFrame