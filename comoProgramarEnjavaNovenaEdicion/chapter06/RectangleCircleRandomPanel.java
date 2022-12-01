/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 11:Drawing Rectangles and Circles Panel
*/
import java.awt.Color;
import java.awt.Graphics;

import java.util.Random;

import javax.swing.JPanel;

public class RectangleCircleRandomPanel extends JPanel{
    
    Random randomNumber=new Random();
    private int width;
    private int height;
    
    private int x1;
    private int y1;

    private int x2;
    private int y2;


    private int rectOrCircle=randomNumber.nextInt(2);
    private int numberOfFigures=10;

    public RectangleCircleRandomPanel(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void paintComponent(Graphics g){
        
        for(int i=1; i<=numberOfFigures; i++){
            if(i%2==0){
                x1=randomNumber.nextInt((i*100)/2);
                y1=randomNumber.nextInt((i*100)/2);

                g.setColor(new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255)));
                g.fillRect(x1, y1, x1, y1);
            }else{
                x2=randomNumber.nextInt((i*200)/2);
                y2=randomNumber.nextInt((i*200)/2);

                g.setColor(new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255)));
                g.fillOval(x2, y2, x2, x2);
            }
        }
    }//end paintComponent    
}//end RectangleCircleRandomPanel