/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 10: Graphic Interface, with java from console mode. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class RectanglesAndOvals extends JPanel{
    private int option; //opcion del usario acerca de cial figura dibujar

    //El constructor establece la opcion del usuario
    public RectanglesAndOvals(int option){
        this.option=option;
    }

    //Dibuja una casaca de figuras, empezando desde la esquina superio Izquierda
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i<=10;i++){
            switch(option){
                case 1: //Dibuja rectangulos
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: //Dibuja Ovalos
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
            }
        }

    }

}//end RectanglesAndOvals