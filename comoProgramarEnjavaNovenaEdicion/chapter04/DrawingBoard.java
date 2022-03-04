/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 04.-Drawing Board, drawing lines. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel{
  
  public void paintComponent(Graphics g){
    
    //Llama a paintComponent para asegurar que el panel se muestre correctamente
    super.paintComponent(g);
    
    int width=getWidth(); //Anchura total
    int height=getHeight();//Altura total
    
    //Dibuja una linea de la esquina superior izquierda a la esquina inferior derecha
    g.drawLine(0, 0, width, height);
        
    //Dibuja la linea de la esquina inferior izquierda a la esquina superior derecha
    g.drawLine(0, width, height, 0);
    
  }//end main
}//end DrawingBoard