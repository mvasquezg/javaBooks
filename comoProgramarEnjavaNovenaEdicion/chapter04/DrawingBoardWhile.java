/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 04.-Drawing Board, drawing lines. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoardWhile extends JPanel{
  
  public void paintComponent(Graphics g){
    
    //Llama a paintComponent para asegurar que el panel se muestre correctamente
    super.paintComponent(g);
    
    int width=getWidth(); //Anchura total
    int height=getHeight();//Altura total
    int w=35;
    
   //Funcionando 
    while(height>10){
      g.drawLine(0, 0, width/2, height/2);
      width+=w;
      height-=w;
      System.out.println("\n");
    }

    width=getWidth();
    height=getHeight();

    while(width>10){
      width-=w;
      height+=w;
      g.drawLine(0, 0, width/2, height/2);
    }


  }//end main
}//end DrawingBoardWhile