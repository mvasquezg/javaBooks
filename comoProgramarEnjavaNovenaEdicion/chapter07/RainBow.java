/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 18: Rain Bow
*/
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RainBow extends JPanel{
    private final static Color VIOLET=new Color(128, 0, 128);
    private final static Color INDIAN_BLUE=new Color(75, 0, 30);

    private Color[] arrayColors={Color.WHITE, Color.WHITE, VIOLET, INDIAN_BLUE, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    public RainBow(){
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio=20;

        int centerX=getWidth()/2;
        int centerY=getHeight()-10;

        for(int i=arrayColors.length; i>0; i--){
            g.setColor(arrayColors[i-1]);

            g.fillArc(centerX-i*radio, centerY-i*radio, i*radio*2, i*radio*2, 0, 180);
        }

        
    }
}//end RainBow