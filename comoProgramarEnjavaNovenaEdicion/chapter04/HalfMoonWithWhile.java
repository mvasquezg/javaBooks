/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 07.-Drawing Board, drawing half moon with lines while iteration. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class HalfMoonWithWhile extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width=getWidth();
        int height=getHeight();
        int x=0, y=0;
        int w=20, h=0;

        //Esquina superior izquierda hacia abajo
        while(y<height){

            if(x==0){
                g.drawLine(x, y, w, height);
                x=0;
                y+=20;
                w+=10;
            }else{
                x+=3;
                y+=10;
                w+=10; 
                g.drawLine(x, y, w, height);
            }
        }//end while
    }//end paintComponent
}//end HalfMoonWithWhile