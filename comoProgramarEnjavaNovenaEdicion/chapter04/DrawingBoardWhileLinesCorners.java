/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 06.-Drawing Board, drawing lines from corners. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoardWhileLinesCorners extends JPanel{
  
  public void paintComponent(Graphics g){
    
    //Llama a paintComponent para asegurar que el panel se muestre correctamente
    super.paintComponent(g);
    
    int width=getWidth(); //Anchura total
    int height=getHeight();//Altura total
    int w=35;

    //Imprime de la esquina superior izquierda al centro parte superior
    while(height>10){
      g.drawLine(0, 0, width/2, height/2);
      width+=w;
      height-=w;
      System.out.println("\n");
    }
   
    //Imprime de la esquina superior izquierda hacia abajo
    width=getWidth();
    height=getHeight();
    
    while(width>10){
      width-=w;
      height+=w;
      g.drawLine(0, 0, width/2, height/2);
    }

    //Imprime de la esquina superior derecha al centro arriba
    width=getWidth();
    height=getHeight();
    while(width>10){
      g.drawLine(250, 0, (width/2), (height/2));
      width-=w;
      height-=w;
      System.out.println("\n");
    }

    //Imprime de la esquina superior derecha hacia abajo
    width=getWidth();
    height=getHeight();

    while((width/2)<250){
      g.drawLine(250, 0, (width/2), (height/2));
      width+=w;
      height+=w;
      System.out.println("\n");
    }
    
    //Imprime de la esquina inferior derecha hacia arriba alta
    width=getWidth();
    height=getHeight();

    while((width/2)<250){
      g.drawLine(250, 226, (width/2), (height/2));
      width+=w;
      height-=w;
    }

    //Imprime de la esquina inferior derecha hacia arriba baja
    width=getWidth();
    height=getHeight();

    while((height/2)<226){
      g.drawLine(250, 226, (width/2), (height/2));
      width-=w;
      height+=w;
    }

    //Imprime de la esquina inferior izquierda hacia abaja
    width=getWidth();
    height=getHeight();

    while((height/2)<226){
      g.drawLine(0, 226, (width/2), (height/2));
      width+=w;
      height+=w;
    }

    //Imprime de la esquina inferior izquierda hacia arriba
    width=getWidth();
    height=getHeight();

    while((height)>10){
      g.drawLine(0, 226, (width/2), (height/2));
      width-=w;
      height-=w;
    }
  }//end main
}//end DrawingBoardWhileLinesCorners